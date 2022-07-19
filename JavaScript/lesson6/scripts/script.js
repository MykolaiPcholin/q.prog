function Human(name, gender, age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.sort = function (arr) {
		arr.sort()
	}
}

const Anna = new Human('Anna', 'female', '23');
const Bill = new Human('Bill', 'male', '29');
const Nick = new Human('Nick', 'male', '28');
const John = new Human('John', 'male', '35');
const Kris = new Human('Kris', 'male', '15');
const Tyler = new Human('Tyler', 'male', '18');
const Rick = new Human('Rick', 'male', '81');

let humans = [Anna, Bill, Nick, John, Kris, Tyler, Rick];

function sorted(a, b) {
	return a.age > b.age ? 1 : a.age < b.age ? -1 : 0
}

humans.sort(sorted)
humans.forEach((element) => console.log(element))
