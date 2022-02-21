# 1    Introduction
Today we are going to create an application that provides information about movies to the user. This is done by modelling movie data to java objects, sort & order a collection of them. You will be working in breakout groups & handing in your repository @ Fronter.

# 2    Notes
We will be working with the dataset:  movies.csv located in Fronter

# 3    Requirements
We  are  going  to  create 5 end-points,  that  each  will  have  a  specific  task  in mind.   You  can  use  the  same  Controller  class.   Annotate  the  controllers  with@RestController.

## 3.1    /
This  end-point  welcomes  the  user  and  prints  out  a  short  description  of  your application

## 3.2    /getFirstShown 
in class This end-points calls a service that finds the first movie from the list and displays the title.

## 3.3    /getRandomThis 
end-point calls a service,  that finds a single random movie from the list and displays the title.

## 3.4    /getTenSortByPopularity
This end-point calls a service that fetches 10 random movies, maps each result to  a  Movie  model  class,  adds  to  a  Movie  Arraylist  and  prints  the  result  to the  browser  -  sorted  in  ascending  order  by  popularity  (Hint:  Remember  thecomparable interface).

## 3.5    /howManyWonAnAwardThis  end-point  prints  how  many  of  the  movies  of  the  data-set  that  won  anaward.git
## 3.6    (Advanced) /filter?char=’x’amount=’n’
This end points calls a service that prints all movies, but only if they contain x character n amount of times
## 3.7    (Advanced) /longest?g1=’x’g2=’y’
This end-point calls a service that compares two genres and finds what genre,on average, has the longest movies.

## 3.8    (Advanced)
If you finish fast - I have a challenge