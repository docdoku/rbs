ALTER TABLE rbs.resource
  ADD COLUMN validation BOOLEAN DEFAULT FALSE,
  ADD COLUMN color VARCHAR(7);
ALTER TABLE rbs.resource_type
  ADD COLUMN slotprofile VARCHAR (255),
  ADD COLUMN color VARCHAR(7),
  ADD COLUMN extendcolor BOOLEAN DEFAULT FALSE;

