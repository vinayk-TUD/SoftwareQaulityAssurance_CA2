# SoftwareQaulityAssurance_CA2

#Demonstrating Software Quality - CA2 - Sofware Quality Assurance - Vinay Kumar 

### Overview 

This reference guide will explore best practices of agile software development. It will provide an example of applying the practices in a software project and demonstrate the benefits of these practices in the following topics using the Scrum methodology.

1. Scrum sprint backlog and task estimation 
2. Unit testing and test-Driven Development 
3. Test coverage metric 
4. Team version-control
5. Code-review checklist

<br><br>

### (1) Scrum sprint backlog and Task Estimaton 

When undertaking new software projects, it is essential to list or outline tasks, goals and features in order accurately predict or measure the time effort and manpower required to complete these goals or objectives. 

In agile development workflow a sprint backlog is developed when your team estimates all tasks that are associated with user stories in quantification of time and effort. The sprint backlog is essentially a list of items teams should complete in a sprint. The practice of creating the sprint backlog results in a shared team perspective, resulting in a task estimation process that is consistent and reliable throughout all sprints. 
it is an essential part of any Agile project during planning so that the team breaks the tasks down into steps 

##### Creating an effective sprint backlog
An effective sprint backlog process must: 
* Contain all tasks and user stories to be addressed during the sprint 
* Have realistic evaluations made by all team members to accurately predict a pace
* Have shared decisions with all team members taking part to diversify perspectives 
* allow for team members to assign tasks to one another, collaborate and promote   communication
* Have continuous updates on regular basis to know where you team and tasks stand


![effort estimate](images/effort_estimat.png)

##### Sprint Backlog

![Sprint 1](images/S1.PNG)
<br>


![Sprint 2](images/S2.PNG)
<br>


![Sprint 3](images/S3.PNG)
<br>

* Here we can see that we have clearly identified our tasks for the project. Dispersing our tasks over three sprints in which we have allocated teams per task as well as certain individuals responsible for the task. We can also see a Size rating or in other words the difficulty estimate of the task and the status of the task or the tasks progress. Following the end of a sprint their is generally a sprint retrospective in order for teams to assess their sprints and make any changes. 

* The estimation of the effort required in terms of difficulty level is measured and decided by the whole team. Here we can see in our sprints that the estimates go in values of 2 increasing with difficulty as 2 is the lowest difficulty level and 10 being the highest. Based of past project experience, examination of feature, requirements and complexity the team can base their difficulty estimate in many ways. Here I have chosen to place a numerical value on the estimate in order for the team to rate their tasks in terms of their perceived difficulty in increments of 2 allowing for some leeway if estimates fall in between increments. 
<br>
<br>
For example we can see how the difficulty estimates vary in sprint 2 as creating a rubcric is thought to be simpler than creating and displaying a list of rubrics by name. Here creating a rubric involves defining the object and instantiating it while he rubric by name involves searching through rubcrics in terms of a name returning incorrect until the chosen name is found.  

##### Velocity 
velocity in Agile is used as a measure how much work can be completed in each sprint. It is widely used as a tool to help  teams create accurate and efficient time lines.It is not meant to be a benchmark as it varies from teams own interpretation of it's measurement. Simply put it's meant to be used as a planning tool for better accuracy in determining the time frame of sprints.

It is measured by units of work completed in a given timeframe. For example most scrum teams would measure the number of given story points in a sprint adding them up and then using the figure based off a few sprint totals to predict how many sprints it will take to complete a project or accurately predict a timeframe for project completion. 

A common mistake in Agile that is made is using velocity as a measure of efficiency. Lower velocity numbers are seen as being attributed to corners being cut and leading to inefficiencies. A team should try maintain a steady number in order to reduce pressure on developers and not promote corner cutting to achieve lower velocity goals. 

### (2) Unit testing and test Driven Development 
Test Driven Development is an approach to software development where test cases are developed to specify and validate the code created. Cases arcreated for each functionality and if a test fails then new code is added or code is rewritten to pass the test and elimate bugs. 

The concept is to write and correct tests that have failed in order to elimate bugs and limit duplication of code tests are done on small code blocks at a time. To perform a TDD test the following steps are done 
<br>

1. Add a test case 
2. Run tests to see if any fail
3. Write some code
4. Run tests and then refactor code if necessary
5. Repeat until all tests pass


##### Unit testing 

### (3) Test Coverage Metric

##### Code Coverage 
* A metric to help understand how much of your source code is tested. It's useful to asses the quality of your test suite to determine how your code was exercised or not excercised by the test suite. Code coverage is one such software testing metric that can help in assessing the test performance and quality aspects of any software.

######Benefits of code coverage
* **Easier maintenance of code base** -  ensure code quality is well-maintained and new features can be added with little-to-no efforts.

* **Exposing poor code** - understand bad, dead, and unused code leading to better practices and improed quality

* ** Faster to market** - Speeds up development time increasing productivity and efficiency 



##### Team version Control


### References 

- [Markdown Language](https://www.markdownguide.org/basic-syntax/)
- [Task Estimation in Scrum](https://www.projectmanagement.com/blog/blogPostingView.cfm?blogPostingID=46054&thisPageURL=/blog-post/46054/Task-Estimation-with-Scrum#_=_)
- [Sprint Backlog](https://www.sealights.io/sprint-velocity/the-sprint-backlog-why-its-important-and-how-to-make-it-great/)
- [Velocity](https://www.planview.com/resources/articles/lkdc-velocity-agile/#:~:text=Velocity%20in%20Agile%20is%20a,iterations%2C%20sprints%2C%20or%20weeks.)
- [Velocity 2](https://www.agilealliance.org/glossary/velocity)