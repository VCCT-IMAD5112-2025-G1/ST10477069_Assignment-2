![Screenshot_20250523_152758](https://github.com/user-attachments/assets/749b335f-3914-4cac-85f7-981251efa1c7)![Screenshot_20250523_152758](https://github.com/user-attachments/assets/b1015ad1-01c9-47ae-b00e-bb86103ba123)# History Flashcards App

A simple Android quiz application that tests users' knowledge of historical facts with true/false questions.

## Features

- Welcome screen with app description
- 5 true/false questions about historical facts
- Immediate feedback on answers
- Score summary at the end
- Review all questions with correct answers
- Responsive UI with appropriate feedback based on score

## Screens

1. **Main Activity**
   - Welcome message
   - App description
   - Start button to begin the quiz

2. **Quiz Activity**
   - Displays one question at a time
   - True/False buttons for answering
   - Automatically progresses to next question

3. **Score Activity**
   - Displays final score (e.g., 3/5)
   - Provides feedback based on performance
   - Options to review questions or exit app

4. **Review Activity**
   - Shows all questions with correct answers
   - Allows users to see what they got right/wrong

## Technical Details

- **Language**: Kotlin
- **Minimum SDK**: Not specified (default for new Android projects)
- **Architecture**: Simple activity-based with explicit intents
- **Components**:
  - Activities for each screen
  - Intent extras for passing data between activities
  - Basic UI elements (TextViews, Buttons)

## How to Use

1. Launch the app to see the welcome screen
2. Tap "Start" to begin the quiz
3. Answer each true/false question
4. View your score after completing all questions
5. Choose to review questions or exit the app

## Code Structure

- `MainActivity`: Entry point with welcome screen
- `MainActivity5`: Quiz logic and question handling
- `ScoreActivity`: Displays final score and feedback
- `ReviewActivity`: Shows all questions with answers

## Question Set

1. University of Oxford is the oldest university in the world. (False)
2. University of Harvard is the oldest university in United States. (True)
3. Is the University of Cape Town the best university in Africa. (True)
4. The largest country in terms of area is Russia. (True)
5. Cape town is the best city in the world for 2025. (True)

## Potential Improvements

1. Add question shuffling
2. Implement a database for questions
3. Add animations between screens
4. Support for multiple quiz categories
5. Sound effects for correct/incorrect answers
6. Progress indicator during quiz
7. User preferences/settings

## Requirements

- Android Studio
- Android device/emulator
- https://youtube.com/shorts/6vXdWhFxB5A?si=gSEyCWeWEagA_7oz

## Installation

1. Clone this repository
2. Open in Android Studio
3. Build and run on emulator or device
