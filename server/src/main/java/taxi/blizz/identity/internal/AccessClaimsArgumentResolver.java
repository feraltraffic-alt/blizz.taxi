package taxi.blizz.identity.internal;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import taxi.blizz.identity.AccessClaims;
import taxi.blizz.platform.DomainException;
import taxi.blizz.platform.ErrorCode;

/** Lets controllers declare {@code AccessClaims} as a parameter; never trusts ids from the body. */
class AccessClaimsArgumentResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return AccessClaims.class.equals(parameter.getParameterType());
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
                                  NativeWebRequest webRequest, WebDataBinderFactory binderFactory) {
        Object claims = webRequest.getAttribute(BearerAuthenticationInterceptor.CLAIMS_ATTRIBUTE,
                RequestAttributes.SCOPE_REQUEST);
        if (claims == null) {
            throw new DomainException(ErrorCode.UNAUTHENTICATED, "No authenticated subject");
        }
        return claims;
    }
}
