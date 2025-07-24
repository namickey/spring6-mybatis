CREATE TABLE item (
    id INT PRIMARY KEY,
    item_name VARCHAR(100) NOT NULL,
    price INT NOT NULL
);

INSERT INTO item (id, item_name, price) VALUES (1, 'Item1', 1000);
INSERT INTO item (id, item_name, price) VALUES (2, 'Item2', 2000);
INSERT INTO item (id, item_name, price) VALUES (3, 'Item3', 3000);
INSERT INTO item (id, item_name, price) VALUES (4, 'Item4', 4000);
INSERT INTO item (id, item_name, price) VALUES (5, 'Item5', 5000);
