package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"

	"github.com/gorilla/mux"
)

// ResponseData - generic response message
type ResponseData struct {
	Message string `json:"message"`
}

// User Object
type User struct {
	Username  string `json:"username"`
	FirstName string `json:"firstName"`
	LastName  string `json:"lastName"`
}

// Users - Array of mock users
var Users []User

func home(w http.ResponseWriter, r *http.Request) {
	fmt.Println(r.Method, r.URL.Path)
	response := ResponseData{Message: "Hello Go"}
	w.Header().Add("Content-Type", "application/json")
	w.WriteHeader(http.StatusOK)
	json.NewEncoder(w).Encode(response)
}

func getUsers(w http.ResponseWriter, r *http.Request) {
	fmt.Println(r.Method, r.URL.Path)
	w.Header().Add("Content-Type", "application/json")
	w.WriteHeader(http.StatusOK)
	json.NewEncoder(w).Encode(Users)
}

func getUser(w http.ResponseWriter, r *http.Request) {
	fmt.Println(r.Method, r.URL.Path)
	vars := mux.Vars(r)
	key := vars["username"]
	for _, user := range Users {
		if user.Username == key {
			w.Header().Add("Content-Type", "application/json")
			w.WriteHeader(http.StatusOK)
			json.NewEncoder(w).Encode(user)
			return
		}
	}
	w.Header().Add("Content-Type", "application/json")
	w.WriteHeader(http.StatusNotFound)
	response := ResponseData{Message: "Data not found"}
	json.NewEncoder(w).Encode(response)
}

func handleRequests() {
	myRouter := mux.NewRouter().StrictSlash(true)
	myRouter.HandleFunc("/", home).Methods("GET")
	myRouter.HandleFunc("/users", getUsers).Methods("GET")
	myRouter.HandleFunc("/users/{username}", getUser).Methods("GET")
	log.Fatal(http.ListenAndServe(":7004", myRouter))
}

func main() {
	// Initialize Mock Users
	Users = []User{
		User{Username: "bchan", FirstName: "Brian", LastName: "Chan"},
		User{Username: "rfederer", FirstName: "Roger", LastName: "Federer"},
	}
	handleRequests()
}
