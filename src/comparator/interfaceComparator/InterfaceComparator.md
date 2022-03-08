# Interface Comparator<T>

__Interface Comparator<T>__ се използва за сравнение на обекти, прилагайки порядък различен от "естественият".
За да го имплементирам е нужно да презапиша неговият метод:
```
int compare (Element e1, Element e2)
```
Интерфейсът на Comparator съдържа множество методи, като най-важният от тях е методът .compare(). Методът .compare() връща числова стойност - ако е отрицателна, тогава "обект a" предхожда "обект b", в противен случай - обратното. Ако методът връща нула, тогава обектите са равни.
За да използвам интерфейс Comparator, първо трябва да създам клас Comparator, който реализира този интерфейс:
```java
class PersonComparator implements Comparator<Person> {
	public int compare(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}
}
```
или
```java
class PersonAgeComparator implements Comparator<Person> {
	public int compare(Person a, Person b) {
		if(a.getAge() > b.getAge()) return 1;
		else if(a.getAge() < b.getAge()) return -1;
		else return 0;
	}
}
```
