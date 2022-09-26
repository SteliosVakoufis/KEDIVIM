// package com.example;

// public final class Exceptions {
//     private enum enumExceptions {
//         INVALID_ACCOUNT,
//         WRONG_PASSWORD
//     }

//     private Exceptions exception;

//     private Exceptions () { }

//     public Exceptions getException() {
//         if (exception == null){
//             return this.exception = new Exceptions();
//         }
//         else {
//             return exception;
//         }
//     }

//     public Exception getExceptions(enumExceptions error_code) {
//         switch (error_code){
//             case INVALID_ACCOUNT:
//                 return new InvalidAccountException();
//             case WRONG_PASSWORD:
//                 return new WrongPasswordException();
//             default:
//                 return new UnkownErrorException();
//         }
//     }

// }

// Exceptions.getException(INVALID_ACCOUNT);
