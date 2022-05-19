#Team Reviews

## Rohan Machine Learning Notes

- Machine learning is the idea that through inputting data and/or giving feedback to the computer, the artificial intelligence can become more accurate
- K nearest algorithm: Algorithm, where, based on the data points near the selected point, the computer will make a judgement.
- More data: better model: better accuracy
- Three ways machine learns:
- Supervised learning: The computer knows the features of the object, and the labels of the object to make an informed decision.
- unsupervised learning: learning with un labeled data
- reinforcement learning: manual feedback given back to the computer when experimentally judging an object, in which the computer will learn for future reference.


## Rohan Neural Network Notes

- How does our brain recognize several different numbers with different patterns if they are not comprehended by a computer by pixels
- The problem is having computers have the same level of pattern recognition our neurons have
- Solution is to create a neural network where each image is split into individual elements we use to identify each number
- ex: an 8, consists of two loops, whereas a 9 consists of one loop in the top have and a strait line segment in the bottom half
- Neuron → thing that stores a number or the “Activation”
- Each layer of the network will check for a different pattern, and the correct combination of each pattern results in understanding what the number is
- The laste layer has 10 neurons which combine all the information known about the image to identify which number it is from one to nine
- Hidden layers correlate to each individual element
- Going to be the algorithm that does all the calculations and recognizes the number
- To find each individual element, the computer must take an area from the pixelated image and average the amount of uncolored pixels in the area
- Each different element, whether being a loop or a strait line, has different averages over a set area
- We can use this information to identify different elements in the overall picture, then add them up together to identify the image
- Can be inconsistent depending on how much the image differs from the uniform understanding of a number
- Neural networks can involve itself in machine learning by imitating how the human brain operates in pattern recognition, and identifying/quantifying things around us with image inputs


## Kian Machine Learning Notes
- Humans learn from past experiences → machines learn from instructions that humans give them
- Machine learning allows machines to learn from past data, machine can measure the various factors that go into past choices and kind of build an algorithm from those observations, the more data the better the model

##### Supervised Learning
- Uses labeled data to train the model
- Each object will have a label associated with it, this data is given to the machine and it uses that to determine certain things (1 rupee is 3 grams, 1 coin is 4 grams, 1 penny is 5 grams, if the computer is given a coin that is 3 grams it will be able to determine it is a rupee)
##### Unsupervised Learning
- Given data is able to be graphed/plotted and we can categorize by the level of each characteristic (usually there will be 2 clusters)
- Data is unlabeled (cricket data, not labeled as batsmen or bowlers, computer determines if they are batsmen or bowlers based on plotted data)
##### Reinforcement Learning
- Based on the system of feedback (if the computer identifies the picture of a dog as a cat, then you give it negative feedback, learns from the feedback and will be able to correctly identify a dog)
- Input → model → output → back into model with feedback


## Kian Neural Networks Notes
- Problem: from a 28x28 grid of pixels, get a number from 0-9 if a number is drawn in it
- Neuron → thing that stores a number or the “Activation”
##### First layer of the network
- Each neuron will represent 1 pixel, each neuron holds the grayscale value of the pixel it represents (from 0-black to 1-white)
##### Last layer of the network
- The last layer of the network has 10 neurons each representing one of the values that can come out of it (0-9)
- Activation will be between 0 and 1, represents how much the system thinks that the number is correct
##### In between layers (hidden layers)
- Going to be the algorithm that does all the calculations and recognizes the numbert
- The way the network works is that it operates activations in one layer to determine the activations in the next
- The numbers can be broken up into different parts (eg. 9 is the loop and the line, but 8 is the same loop but another loop under)
- However realizing these parts may pose a difficult problem, so we might have to break up those parts into even smaller parts too
- The structure so far is pixels, parts of parts of numbers, parts of numbers, final number
- Computer has to calculate weighted sum of certain pixels in a certain area, if it’s above a certain threshold it determines which part of a part of the number is there, then it repeats the process when it puts them together
- ~13000 different adjustments that you can do to change this system
