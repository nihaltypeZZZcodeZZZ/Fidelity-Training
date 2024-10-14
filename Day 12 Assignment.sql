alter table supplier 
add constraint chk_contact_length check(length(contact) = 10);