const BR = "<br><br>";
let space = () => document.write(BR);

class Book {
    constructor(title, author, hasRead) {
        this.title = title;
        this.author = author;
        this.hasRead = hasRead;
    }

    toString() {
        space();
        return `${this.title}, ${this.author}, ${this.hasRead}`;
    }

}

let library = [
    new Book("Bill Gates", "The Road Ahead", true),
    new Book("Steve Jobs", "Walter Isaacson", true),
    new Book("Hocking Jay", "Suzane Collins", false)
];

for (const book of library) {
    document.write(!book.hasRead ? book.toString() : "");
}
