var customers = [
    {
        "id": 100,
        "firstname": "Jack",
        "lastname": "Daniel",
        "orders": [
            {
                "date": "30/4/2019",
                "menu": "menu_1",
                "price": "5",
                "quantity": "1"
            },
            {
                "date": "1/5/2019",
                "menu": "menu_2",
                "price": "3",
                "quantity": "2"
            },
            {
                "date": "2/5/2019",
                "menu": "menu_3",
                "price": "3",
                "quantity": "2"
            },
        ]
    },
    {
        "id": 101,
        "firstname": "John",
        "lastname": "Snow",
        "orders": [
            {
                "date": "30/4/2019",
                "menu": "menu_4",
                "price": "5",
                "quantity": "1"
            },
            {
                "date": "1/5/2019",
                "menu": "menu_5",
                "price": "5",
                "quantity": "1"
            },
            {
                "date": "3/5/2019",
                "menu": "menu_1",
                "price": "5",
                "quantity": "1"
            },
        ]
    },
    {
        "id": 102,
        "firstname": "Alice",
        "lastname": "Alicayh",
        "orders": [
            {
                "date": "30/4/2019",
                "menu": "menu_1",
                "price": "5",
                "quantity": "2"
            },
            {
                "date": "1/5/2019",
                "menu": "menu_2",
                "price": "5",
                "quantity": "2"
            },
            {
                "date": "3/5/2019",
                "menu": "menu_5",
                "price": "3",
                "quantity": "1"
            },
        ]
    }
]

console.log("Print all")
customers.forEach(element => {
    console.log(element);
    document.write(JSON.stringify(element) + "<br>");
})

document.write("<br>");

console.log("menu === menu_2");
customers.forEach(customer => {
    customer.orders.forEach(order => {
        // if (order.menu === "menu_2") {
        //     console.log(order);
        //     document.write(
        //         JSON.stringify(customer.firstname) +
        //         " " +
        //         JSON.stringify(customer.lastname) +
        //         " " +
        //         JSON.stringify(order.menu) +
        //         " " +
        //         JSON.stringify(order.date) +
        //         "<br>"
        //     );
        // }
        if (order.date === "1/5/2019") {
            var toWrite =
            `
            <table>
                <tr>
                    <td>${JSON.stringify(customer.firstname)}</td>
                    <td>${JSON.stringify(customer.lastname)}</td>
                    <td>${JSON.stringify(order.menu)}</td>
                    <td>${JSON.stringify(order.date)}</td>
                <tr>
            </table>
            <br>
            `;
            
            console.log(order);
            document.write(toWrite);
        }
    })
});