Create a portlet.

Functionality:

The application for a small newspaper, engaged in writing and publishing popular science articles.

There are three types of roles in the editorial board: 
1) Editor-in-chief 
2) Author 
3) Reviewer

The author writes articles and sends them for approval to the editor-in-chief. The main editor can confirm or reject the publication. The article is published or returned to the author for revision with a comment, respectively. Also, the editor-in-chief can withdraw any article from the publication at any time. The reviewer writes reviews of published articles. As our newspaper is modern and fashionable, it publishes its articles on the website, where all visitors can read them (articles and their reviews).

Acceptance Criteria:
 To create and distribute roles, use the standard portal functionality.
 Depending on the role, users should see different tabs in the portlet.
 
The editor sees the tabs: 
1) Articles that are waiting for confirmation (here he reviews / confirms / rejects the publication) 
2) Already published articles (here he can view / withdraw from the publication of the article) 

The author sees the tabs: 
1) All his articles with the status display published / edited / waiting for the confirmation of the editor-in-chief.The author sees the comments that the editor-in-chief has left the rejected articles, can change the text of the article and resend it for confirmation. p can not edit) 
2) Already published articles 

The reviewer sees the tabs: 
1) Already published articles (with the possibility of leaving comments. Comment consists of a header, avatar and user name, comment leaving date, comment text) Any other user sees only published articles and reviews to them.

Front-end task:
+ Set the background to the entire portlet (color to choose)
+ The entire portlet should cast a shadow (the parameters to choose from, the main thing is to see it was)
+ Make a round green button with white text, when you hover the mouse on which the frame and text become green, and the background is white
+ Between a number of buttons and the working area of ​​the portlet, make a distance of 50px

+ For all delete buttons, add a pop-up alert (do you really want to delete ...?) With yes and cancel buttons and they should work
+ Add the text "License Agreement" at the bottom of the portlet, when you click on it, the container with the Ipsum logger will appear under it, and if you press it again, the text will be hidden.
+ Make a button that, upon tapping, will knock ajax into any open REST tester and output an answer in the text field that comes from there.
