CREATE TABLE fridge_users (
  fridge_id BIGINT NOT NULL,
  FOREIGN KEY (fridge_id) REFERENCES fridges(id) ON DELETE CASCADE,
  user_id BIGINT NOT NULL,
  FOREIGN KEY (user_id) REFERENCES users(id),
  PRIMARY KEY (fridge_id, user_id),
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
)
