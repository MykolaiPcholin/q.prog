function User (firstName = "", lastName = "") {
    this.firstName = firstName;
    this.lastName = lastName;
}

User.prototype.getLogin = function() {
    return this.firstName.toLowerCase().charAt(0) + this.lastName.toLowerCase();
}

function createNewUser() {
    return new User(prompt("First name?"), prompt("Last name?"));
}

let user = createNewUser();
alert(user.getLogin());