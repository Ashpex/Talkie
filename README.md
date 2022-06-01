# ChatApp-Java

![](screenshots/Screenshot-from-2022-06-01-07-55-23.png)

![](screenshots/Screenshot-from-2022-06-01-15-06-45.png)

### Features

+ Register chat account (saved in MariaDB/MySQL database)
+ Chat 1v1
+ Chat with many people at the same time (Multithreading)
+ Chat Group
+ Send file



### Build and Run Project

#### Create database

Firstly, because the program uses MariaDB to store user data, we need to create and run the database

- We need to type commands to log in as root. by typing the command: 

  ```shell
  mysql -u root -p
  ```

  ![Screenshot from 2022-06-01 15-39-32](screenshots/Screenshot-from-2022-06-01-15-39-32.png)

- Next, we need to create a database named “chatUser” with the following comand:

  ```sql
  CREATE DATABASE chatUser;
  ```

  ![Screenshot from 2022-06-01 15-40-53](screenshots/Screenshot-from-2022-06-01-15-40-53.png)

- Run the following SQL script to create the table:

  ```sql
  DROP TABLE IF EXISTS chatUser;
  
  CREATE TABLE chatUser (
    username varchar(50) NOT NULL primary key,
    userpassword varchar(256) DEFAULT NULL
  )
  ```

#### Build the project

- Go to the project directory and type the following command:

  ```shell
  mvn install
  ```

  ![Screenshot from 2022-06-01 16-58-33](screenshots/Screenshot-from-2022-06-01-16-58-33.png)

- After maven says "BUILD SUCCESS", the `.jar` file will be in the directory called `target`, go to that directory and execute the java program by typing the following command:

  ```shell
  java -jar ChatClient-1.0-SNAPSHOT-jar-with-dependencies.jar
  ```

- Note, there will be 2 `.jar` files, we need to select the file whose name includes the word “with-dependencies.” For the ChatServer project we also do the same. The following screen shot is the result of the application running successfully:

  ![](screenshots/Screenshot-from-2022-06-01-17-23-00.png)









