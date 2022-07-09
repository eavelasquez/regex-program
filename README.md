# Regex Program

This program builds various regular expressions and uses them to match a string. It also prints the string and the regular expression used.

Output:

```
Regular expression: ^[A-Z]{3}[0-9]{3}$
Name: car plate number
Valid Example: ABC123 - Result: true
Invalid Example: ABC123D - Result: false
Description: A car plate number in Colombia.

Regular expression: ^[2-6][0-9]{2}-[0-9]{4}$
Name: fixed-line phone number
Valid Example: 312-1234 - Result: true
Invalid Example: 3123-1234 - Result: false
Description: A fixed-line phone number in Medellin.

Regular expression: ^3[0-5][0-9]-[0-9]{3}-[0-9]{4}$
Name: mobile phone number
Valid Example: 312-123-4598 - Result: true
Invalid Example: 3123-12398 - Result: false
Description: A mobile phone number in Colombia.

Regular expression: ^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$
Name: email
Valid Example: john@gmail.com - Result: true
Invalid Example:    @gmail.com - Result: false
Description: An email address.

Regular expression: ^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\d\d$
Name: date
Valid Example: 01/01/2000 - Result: true
Invalid Example: 2000/01/01 - Result: false
Description: A date in the format dd/mm/yyyy or dd-mm-yyyy.

Regular expression: ^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])$
Name: time
Valid Example: 12:00:00 - Result: true
Invalid Example: 12-00-00 - Result: false
Description: A time in the format hh:mm:ss.

Regular expression: ^(int|double|float)\s+[a-zA-Z_][a-zA-Z0-9_]*\s*=\s*[0-9]*\.?[0-9]*;$
Name: variable declaration
Valid Example: int x = 10; - Result: true
Invalid Example: int x = 10 - Result: false
Description: A variable declaration in Java.

Regular expression: ^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]
Name: url
Valid Example: https://www.google.com - Result: true
Invalid Example: smtp://google.com - Result: false
Description: A url.

Regular expression: ^[A-Za-zÑñáéíóúÁÉÍÓÚ]+\s[A-Za-zÑñáéíóúÁÉÍÓÚ]+$
Name: full name
Valid Example: John Doe - Result: true
Invalid Example: JohnDoe - Result: false
Description: A full name in Colombia.

Regular expression: ^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$
Name: password
Valid Example: q8W1gFr1%C - Result: true
Invalid Example: 12345678 - Result: false
Description: A password that must contain at least 8 characters, one letter, one number and one special character.

Regular expression: ^[-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?$
Name: double precision floating point number
Valid Example: 1.23 - Result: true
Invalid Example: 1.2.3 - Result: false
Description: A double precision floating point number.
```