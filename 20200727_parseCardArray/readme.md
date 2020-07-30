#Task
Дан массив строк, где каждая строка это информация о карте. Каждая строка имеет следующий вид:  
cardNumber ownerName (т.е. два поля разделенные пробелом)
Например:  
1234576487658953 Andy  
1334576487658953 Ivan  
Если номер карты начинается с "12" это Visa, если с "13" - Master
Реализовать метод который вернет массив объектов-карт. Реализовать метод toSecureString маскирующий номер карты "*" (для Visa и Master по разному).


Given an array of String. Every String in the array is a card info:
cardNumber ownerName (two fields separated by space). For example:  
1234576487658953 Andy  
1334576487658953 Ivan
The card is Visa if the number start with "12".
The card is Master if the number start with "13".  
Implement method that return array of card. Implement method toSecureString that masks the card number. 

