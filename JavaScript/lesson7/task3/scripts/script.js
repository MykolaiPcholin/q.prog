function User (firstName = "", lastName = "", birthday = "", ) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthday = birthday;
}

User.prototype.getLogin = function() {
    return this.firstName.toLowerCase().charAt(0) + this.lastName.toLowerCase();
}

User.prototype.getAge = function() {
    return new Date().getFullYear() - new Date(this.birthday.slice(6, this.birthday.length), this.birthday.slice(3, 5), this.birthday.slice(0, 2)).getFullYear();
}

User.prototype.getPassword = function() {
    return this.firstName.toUpperCase().charAt(0) + this.lastName.toLowerCase() + this.birthday.slice(6,this.birthday.length);
}

function createNewUser() {
    return new User(prompt("First name?"), prompt("Last name?"), prompt("Enter birthday(dd.mm.yyyy)"));
}

const user = createNewUser();

console.dir(user)
console.log(user.getAge());
console.log(user.getPassword());