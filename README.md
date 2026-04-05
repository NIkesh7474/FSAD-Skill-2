# Skill-2: Hibernate CRUD Operations

| Field   | Details                                             |
|---------|-----------------------------------------------------|
| Student | Ch. Venkata Sai Nikesh                              |
| ID      | 2400080138                                          |
| Section | 51                                                  |
| GitHub  | https://github.com/NIkesh7474/FSAD-Skill-2          |

---

## Aim

To implement CRUD (Create, Read, Update, Delete) operations using Hibernate ORM with proper entity mapping using JPA annotations and MySQL database.

---

## What is This Project?

This project is a **Hibernate ORM** application that manages a retail inventory system.

Instead of writing raw SQL queries, Hibernate automatically generates SQL from Java code using **JPA annotations**.

**4 CRUD Operations:**
- `CREATE` — Insert new products into database
- `READ`   — Retrieve product by ID
- `UPDATE` — Change price and quantity
- `DELETE` — Remove discontinued products

---

## Key Annotations

| Annotation              | Purpose                                        |
|-------------------------|------------------------------------------------|
| @Entity                 | Marks class as a database table                |
| @Table(name="product")  | Maps class to the product table in MySQL       |
| @Id                     | Marks field as primary key                     |
| @GeneratedValue         | Auto-increments ID using MySQL AUTO_INCREMENT  |

---

## Project Structure

```
FullStack-Skill-2/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/fsad/
│       │       ├── MainApp.java
│       │       ├── entity/
│       │       │   └── Product.java
│       │       └── dao/
│       │           ├── HibernateUtil.java
│       │           └── ProductDAO.java
│       └── resources/
│           └── hibernate.cfg.xml
├── pom.xml
└── README.md
```

---

## Tech Stack

| Technology  | Version | Purpose                      |
|-------------|---------|------------------------------|
| Java        | 17      | Programming language          |
| Hibernate   | 6.4.1   | ORM framework                 |
| MySQL       | 8.x     | Relational database           |
| Maven       | 3.x     | Build and dependency tool     |
| STS/Eclipse | -       | IDE                           |

---

## Database Configuration

```xml
URL      : jdbc:mysql://localhost:3306/fsad
Username : root
Password : root
Dialect  : MySQL8Dialect
DDL Auto : update
```

> Make sure MySQL is running and database `fsad` exists before running.

---

## CRUD Operations

### INSERT — Add Products
```java
dao.saveProduct(new Product("Laptop",   "Dell i7 16GB",    50000, 10));
dao.saveProduct(new Product("Mouse",    "Wireless 2.4GHz",   699, 50));
dao.saveProduct(new Product("Keyboard", "Mechanical RGB",   2999, 30));
```

### READ — Get Product by ID
```java
dao.getProduct(1);
```

### UPDATE — Change Price and Quantity
```java
dao.updateProduct(2, 599, 60);
```

### DELETE — Remove Product
```java
dao.deleteProduct(3);
```

---

## Expected Console Output

```
Hibernate: create table product (...)
Hibernate: insert into product (...) values (?, ?, ?, ?)
Hibernate: insert into product (...) values (?, ?, ?, ?)
Hibernate: insert into product (...) values (?, ?, ?, ?)
Product saved: Laptop
Product saved: Mouse
Product saved: Keyboard
Product found: Product [id=1, name=Laptop, description=Dell i7 16GB, price=50000.0, quantity=10]
Hibernate: update product set ... where id=?
Product updated: Mouse
Hibernate: delete from product where id=?
Product deleted: Keyboard
```

---

## MySQL Workbench Output (After INSERT)

```
+----+------------------+----------+---------+----------+
| id | description      | name     | price   | quantity |
+----+------------------+----------+---------+----------+
|  1 | Dell i7 16GB     | Laptop   | 50000.0 | 10       |
|  2 | Wireless 2.4GHz  | Mouse    | 699.0   | 50       |
|  3 | Mechanical RGB   | Keyboard | 2999.0  | 30       |
+----+------------------+----------+---------+----------+
```

---

## How to Run

**Step 1** — Create MySQL database
```sql
CREATE DATABASE fsad;
```

**Step 2** — Open Eclipse / STS

**Step 3** — Import project
```
File -> Import -> Maven -> Existing Maven Projects -> Finish
```

**Step 4** — Run the app
```
Right click project -> Run As -> Maven build...
Goal: clean compile exec:java -> Click Run
```

---

## Tasks Completed

- [x] Task 1  - Created Maven project in STS
- [x] Task 2  - Added Hibernate and MySQL dependencies in pom.xml
- [x] Task 3  - Created hibernate.cfg.xml with MySQL config
- [x] Task 4  - Created Product entity with JPA annotations
- [x] Task 5  - Created HibernateUtil for SessionFactory
- [x] Task 6  - Implemented ProductDAO with CRUD operations
- [x] Task 7  - Created MainApp to run all operations
- [x] Task 8  - Inserted 3 product records
- [x] Task 9  - Retrieved product by ID
- [x] Task 10 - Updated price and quantity
- [x] Task 11 - Deleted discontinued product
- [x] Task 12 - Verified results in MySQL Workbench

---

## Git Commands

```cmd
cd C:\Users\HP\Downloads\FullStack-Skill-2\FullStack-Skill-2

git init
git add .
git commit -m "Skill2: Hibernate CRUD Operations"
git remote add origin https://github.com/NIkesh7474/FSAD-Skill-2
git branch -M main
git push -u origin main --force
```

> Enter your **Personal Access Token** when asked for password
