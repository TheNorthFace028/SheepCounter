# Java basics practice

## Sheepcounter

![sheep](https://www.ciwf.eu/media/7430330/sheep-closeup-eating-grass.jpg?anchor=center&mode=crop&width=365&height=200)

Create a new maven based project for this exercise.

### 1. Simple sheep counter 🐑

Write a method, that counts how many times the word "sheep" was passed to it in it's arguments array.

Write tests to this method.

```java
String[] animals = new String[] {"sheep", "duck", "dog", "sheep"};
        int actual = sheepCount(animals); // actual = 2
```

<br><br><br><br><br>

----
### 2. Remembering sheep counter

Modify the code, so it remembers all the sheeps, that were passed down during previous calls;
```java
SheepCounter sc = new SheepCounter();
String animals[] = new String[] {"sheep", "duck", "dog", "sheep"};
int actual = sc.sheepCount(animals); // actual = 2
actual = sc.sheepCount(animals); // actual = 2

int allSheepCount = sc.getAllSheepCount(); // allSheepCount = 4
	
```

Does your code handle `null` inputs?

<br><br><br><br><br>

----
### 3. Wolf counter 🐺

Modify the class, so that it can also count the "wolf"-s. Can you refactor the class?

```java
SheepCounter sc = new SheepCounter();
String animals[] = new String[] {"sheep", "duck", "wolf", "sheep"};
int actual = sc.wolfCount(animals); // actual = 1	
```
<br><br><br><br><br>

----
### 4. Hungry wolf - eats the sheep 🍗

Wolf now eat the sheep after them: If a sheep is preceeded by a wolf, it will be eaten.

Example:
```
orange sheep wolf sheep sheep
                    ^ this sheep will be eaten by the wolf befor it.
```


```java
SheepCounter sc = new SheepCounter();
String[] animals = new String[] {"sheep", "duck", "wolf", "sheep"};
int actual = sc.getAliveSheepCount(animals); // actual = 1	
```
<br><br><br><br><br>

----
### 5. Wolfs in disguise

Wolfs try to disguise themself by changing their letters cases.
Now they can appear for example as: "Wolf", "wOlf", "wolF", "WoLf".

```java
SheepCounter sc = new SheepCounter();
String[] animals = new String[] {"sheep", "duck", "wOlF", "sheep"};
int actual = sc.getAliveSheepCount(animals); // actual = 1	
```
<br><br><br><br><br>

----
### 6. Wolfs in disguise 2

Wolfs are getting smarter. They can disguise themselfs by 1 or 2 modifications.
A modification is deletion, insertion, or substitution of 1 letter.
Wolfs now can look like:
`"wo", "wf", "Swolfp", "shlf"`

How can you detect a wolf now?

Can you find `"An algorithm for measuring the difference between two character sequences."`?

How can you use it in your project?
