const data = [
  { username: 'admin', name: 'admin1', surname: "admin1", category:"Διοικητικός", email:"admin1@aueb.gr" },
  { username: 'xxxx1', name: 'Όνομα1', surname: "Επίθετο1", category:"Διοικητικός", email:"xxxx1@aueb.gr" },
  { username: 'xxxx2', name: 'Όνομα2', surname: "Επίθετο2", category:"ΔΕΠ", email:"xxxx2@aueb.gr" },
  { username: 'xxxx3', name: 'Όνομα3', surname: "Επίθετο3", category:"ΕΔΙΠ", email:"xxxx3@aueb.gr" },
  { username: 'xxxx4', name: 'Όνομα4', surname: "Επίθετο4", category:"ΕΤΕΠ", email:"xxxx4@aueb.gr" }            
];

$(document).ready(function(){
  
  // Αρχικά γίνεται μέσα στο document function 
  // var len = data.length;
  // for (var i=0; i<len; i++){
  //     var username = data[i].username;
  //     var name = data[i].name;
  //     var surname = data[i].surname;
  //     var category = data[i].category;
  //     var email = data[i].email;
      
  //     console.log(username, name);

  //     var tr_str = "<tr>" +
  //         "<td>" + username + "</td>" +
  //         "<td>" + name + "</td>" +
  //         "<td>" + surname + "</td>" +
  //         "<td>" + category + "</td>" +
  //         "<td>" + email + "</td>" +
  //         "<td><button class='btnDelete btn btn-primary' value=\'"+username+"\'>Διαγραφή</button></td>";
  //         "</tr>";

  //     $("#userTable tbody").append(tr_str);
  // }

  // Στη συνέχεια δημιουργούμε την createTbody function    
  createTbody(data)
  
  $('.row').on('click', '.btnSubmit', function () {
      let username = $("#username").val();
      let name = $("#name").val();
      let surname = $("#surname").val();
      let category = $("#category option:selected").text();
      let email = $("#email").val();

      let item = {
          'username': username,
          'name': name,
          'surname': surname,
          'category': category,
          'email': email
      }
      
      const updateUser = localStorage.getItem('updateUser');

      if (updateUser) {
          
        let index = data.findIndex(object => {
            return object.username === updateUser;
        });

        data[index]=item;
        
        localStorage.removeItem('updateUser');
      } else {
          data.push(item);
      }
      
      // console.log(data);
      createTbody(data);
      resetForm();
  });

  $('.row').on('click', '.btnReset', function () {
      resetForm();
  });
  
  $('#tbody').on('click', '.btnDelete', function () {
      let btnValue = $(this);
      // Αρχικά δεν βάζουμε το empty σε τρίτη φάση το μεταφέρουμε στο createTbody()
      // $("#userTable > tbody").empty();
      
      let index = data.findIndex(object => {
          return object.username === btnValue.val();
      });
      data.splice(index,1);
    
      createTbody(data);
  });

  $('#tbody').on('click', '.btnUpdate', function () {
      let btnValue = $(this);

      item = data.find(x => x.username === btnValue.val());

      $("#username").val(item.username);
      $("#username").prop( "disabled", true );
      $("#password").prop( "disabled", true );
      $("#name").val(item.name);
      $("#surname").val(item.surname);
      $("#category").val(item.category);
      $("#email").val(item.email);

      localStorage.setItem('updateUser', item.username);
  });
});

function createTbody(data){

  $("#userTable > tbody").empty();

  let len = data.length;
  for (let i=0; i<len; i++){
      let username = data[i].username;
      let name = data[i].name;
      let surname = data[i].surname;
      let category = data[i].category;
      let email = data[i].email;
      
      // console.log(username, name);

      let tr_str = "<tr>" +
          "<td>" + username + "</td>" +
          "<td>" + name + "</td>" +
          "<td>" + surname + "</td>" +
          "<td>" + category + "</td>" +
          "<td>" + email + "</td>" +
          "<td>" +
              "<button class='btnUpdate btn btn-primary' value=\'"+username+"\')'>Τροποποίηση</button> " +
              "<button class='btnDelete btn btn-primary' value=\'"+username+"\'>Διαγραφή</button>" +
          "</td>" + 
          "</tr>";

      $("#userTable tbody").append(tr_str);
  }
}

function resetForm(){
  $("#username").prop( "disabled", false );
  $("#password").prop( "disabled", false );
  $("#frmUser")[0].reset()
}