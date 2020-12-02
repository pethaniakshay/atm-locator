### ATM Locator - Using Apache Camel

### Minimum Supported Tomcat Version
Tomcat 9.0

### Spring Boot version

2.4.0

### Generate Executable War file

```
mvn clean package
```

This will generate following war file in the ```target``` directory

```
atm-locator-0.0.1-SNAPSHOT.war
```

### Run war as java -jar command

```
java -jar atm-locator-0.0.1-SNAPSHOT.war
```

### Run war in tomcat 9

1. Goto tomcat homepage

```
locahost:8080
```

2. Click on Manager App and login to that Manager App Console

3. In Manager UI, Under War file to deploy. Upload war file that you want to deploy

4. By clicking on deploy button. App will be deployed

### Test App

1. Go to ```http://localhost:8080/atm-locator-0.0.1-SNAPSHOT/``` 

2. It will ask Username and Password. Enter following credentials as user name Password.

```
UserName: admin
Password: admin@123
```

3. After successful login. It will be redirected to the ATM location table page.



