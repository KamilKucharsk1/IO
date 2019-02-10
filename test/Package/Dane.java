package Package;


import Package.Package2.Egzemplarz;
import Package.Package2.Uzytkownik;
import Package.Package2.filmTitle;
import Package.Package2.filmTitle;
import java.util.Date;
import java.text.SimpleDateFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Konrad
 */
public class Dane {
public String daneFilmow[][] = new String[][]{
    {"0", "1", "Skazani na Shawshank"}, 
    {"0", "2", "Avatar"},
    {"0", "3", "Titanic"}, 
    {"0", "4", "Forrest Gump"},
    {"0", "5", "Lost"},
    {"0", "6", "Avengers"},
    {"0", "7", "Chlopaki nie placza"},
    {"0", "8", "Kiler"},
};
    public filmTitle filmy[] = {new filmTitle(daneFilmow[0]),new filmTitle(daneFilmow[1]),new filmTitle(daneFilmow[2])};
  
  public String daneUz[][] = new String[][]{ 
      {"1", "Paweł Nowak", "haslo123"},
         {"2", "Kowalski", "fdsafd"},
         {"3", "Jan", "haslo1"},
         {"4", "Adam", "haslo12"},
         {"5", "Janusz", "haslo13"},
         {"6", "Grazyna", "haslo14"},
  };
  
  public Uzytkownik uzytk[]={new Uzytkownik(daneUz[0]), new Uzytkownik(daneUz[1]),new Uzytkownik(daneUz[2])};
  
 public String daneEgz[][] = new String[][]{ 
     {"0", "1"},
     {"0", "2"}, 
     {"0", "3"},
     {"0", "4"},
     {"0", "5"},
     {"0", "6"},
     {"0", "7"},             
 };
 
 public Egzemplarz egz[]={new Egzemplarz(daneEgz[0]),new Egzemplarz(daneEgz[1]),new Egzemplarz(daneEgz[2])};
 
 public String daneRez[][] = new String[][]{
     {"2018","12","15" }, 
     {"2018","07","11" },
     {"2018","01","09" }, 
     {"2018","12","14" },
 };
 
 public String danedaty[][]= new String[][]{
    {"2017","12","12"},
    {"2018","12","12"},
    {"2018","01","01"},
    {"2018","08","22"},
    {"2018","12","30"},
    {"2019","01","12"},
    {"2020","01","12"},
    {"2019","07","14"},


};
 
 public Date daty[] ={
     new Date(Integer.parseInt(danedaty[0][0]),Integer.parseInt(danedaty[0][1]),Integer.parseInt(danedaty[0][2])),
     new Date(Integer.parseInt(danedaty[1][0]),Integer.parseInt(danedaty[1][1]),Integer.parseInt(danedaty[1][2])),
     new Date(Integer.parseInt(danedaty[2][0]),Integer.parseInt(danedaty[2][1]),Integer.parseInt(danedaty[2][2])),
     new Date(Integer.parseInt(danedaty[3][0]),Integer.parseInt(danedaty[3][1]),Integer.parseInt(danedaty[3][2])),
     new Date(Integer.parseInt(danedaty[4][0]),Integer.parseInt(danedaty[4][1]),Integer.parseInt(danedaty[4][2])),
     new Date(Integer.parseInt(danedaty[5][0]),Integer.parseInt(danedaty[5][1]),Integer.parseInt(danedaty[5][2])),
     new Date(Integer.parseInt(danedaty[6][0]),Integer.parseInt(danedaty[6][1]),Integer.parseInt(danedaty[6][2])),
     new Date(Integer.parseInt(danedaty[7][0]),Integer.parseInt(danedaty[7][1]),Integer.parseInt(danedaty[7][2])),
     
};
 
 
 
 }
  
  
  

