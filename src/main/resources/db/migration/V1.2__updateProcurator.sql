
alter table procurator add CONSTRAINT procurator_Age check (procuratorate_name>=18);
alter table procurator add CONSTRAINT procurator_Sex check (sex='男' or sex='女');
alter table procurator add CONSTRAINT procurator_Experience check (experience>0);

