var username_to_change = "" // empty is for create and with data for update 
// console.log(data);

// let url = "https://node-ajax-exercise-sev-opa.herokuapp.com";
let url = "http://localhost:3000";

$(document).ready(function () {
    getData();

    $('#tbody').on('click', '.btnUpdate', function () {
        let username = $(this).val();

        $.ajax({
            url: url + '/user/findOne' + '?' + $.param({ "username": username }),
            type: 'get',
            dataType: 'JSON'
        })
            .done(function (response) {
                const status = response.status;
                const data = response.data;

                if (status) {
                    alert(true, "Succesful data retrieval!");
                    $("#username").val(data.username);
                    $("#username").prop("disabled", true);
                    $("#password").prop("disabled", true);
                    $("#name").val(data.name);
                    $("#surname").val(data.surname);
                    $("#category").val(data.category);
                    $("#email").val(data.email);
                    $(".btnSubmit").val("modify");
                } else {
                    alert(false, "Error in retrieving data!");
                }
            });
    });

    $('#tbody').on('click', '.btnDelete', function () {
        let btnValue = $(this);
        let username = btnValue.val();

        $.ajax({
            url: url + '/user/delete' + '?' + $.param({ "username": username }),
            type: 'delete',
            dataType: 'JSON'
        })
            .done(function (response) {
                // console.log(">>", response);
                const status = response.status
                const data = response.data

                if (status) {
                    getData();
                    alert(true, "Data deleted succesfully!");
                } else {
                    alert(false, "Data deletion was not possible.");
                }
            });
    });

    $('.row').on('click', '.btnSubmit', function () {
        var username = $("#username").val();
        var name = $("#name").val();
        var surname = $("#surname").val();
        var category = $("#category option:selected").text();
        var email = $("#email").val();

        var item = {
            'username': username,
            'name': name,
            'surname': surname,
            'category': category,
            'email': email
        }

        if ($(".btnSubmit").val() === "insert") {
            $.ajax({
                url: url + "/user/create/",
                type: "get",
                data: item,
                dataType: "JSON"
            })
                .done(function (response) {
                    const status = response.status
                    const data = response.data

                    if (status) {
                        getData();
                        resetForm();
                        alert(true, "Inserted user.");
                    } else {
                        alert(false, "Can't insert user." + data.message)
                    }
                });
        } else if ($(".btnSubmit").val() === "modify") {
            $.ajax({
                url: url + "/user/update",
                type: "post",
                data: item,
                dataType: "JSON"
            })
                .done(function (response) {
                    const status = response.status;
                    const data = response.data;

                    if (status) {
                        alert(true, "Succesfully updated user!");
                        getData();
                        resetForm();
                    } else {
                        alert(false, "Error updating user! " + status.message);
                    }
                });
        }
    });

});

function getData() {
    $.ajax({
        url: url + '/user/findAll',
        type: 'get',
        dataType: 'JSON'
    })
        .done(function (response) {
            // console.log(">>", response);

            const status = response.status;
            const data = response.data;

            if (status) {
                resetForm();
                createTbody(data);
            } else {
                alert("Error in searching for user" + data.message);
            }

        });
}

function createTbody(data) {

    $("#userTable > tbody").empty();

    // console.log(data);
    var len = data.length;
    for (var i = 0; i < len; i++) {
        var username = data[i].username;
        var name = data[i].name;
        var surname = data[i].surname;
        var category = data[i].category;
        var email = data[i].email;

        // console.log(username, name);

        var tr_str = "<tr>" +
            "<td>" + username + "</td>" +
            "<td>" + name + "</td>" +
            "<td>" + surname + "</td>" +
            "<td>" + category + "</td>" +
            "<td>" + email + "</td>" +
            "<td>" +
            "<button class='btnUpdate btn btn-primary' value=\'" + username + "\'>Τροποποίηση</button> " +
            "<button class='btnDelete btn btn-primary' value=\'" + username + "\'>Διαγραφή</button>" +
            "</td>" +
            "</tr>";

        $("#userTable tbody").append(tr_str);
    }
}

function alert(status, message) {
    if (status) {
        $(".alert").addClass("alert-success");
        $(".alert").removeClass("alert-danger");
    } else {
        $(".alert").addClass("alert-danger");
        $(".alert").removeClass("alert-success");
    }

    $(".alert").html(message);
}

function resetForm() {
    $("#myform")[0].reset();
    $(".btnSubmit").val("insert");
    $("#username").prop("disabled", false);
    $("#password").prop("disabled", false);
}