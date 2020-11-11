package models;

import services.Visitor;

interface Element {
     void print();
     void accept(Visitor visitor);
}