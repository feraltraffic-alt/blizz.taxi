-- Associate raw, encrypted and partial staging bytes before reading a body. Legacy random names cannot be
-- guessed: an old QUARANTINE row with no known key is retained as an explicit deletion failure for repair.
alter table file_object add column staging_key text unique;
