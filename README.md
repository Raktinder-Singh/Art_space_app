![Screenshot 2024-09-20 095402](https://github.com/user-attachments/assets/c1688f42-d067-415a-9d60-9a7ab67a533f)ArtSpace - Art Gallery App
Overview
The ArtSpace app is a simple Android application that displays a gallery of artwork with corresponding titles and author names. The user can navigate through different images using "Next" and "Previous" buttons. The app is built using Jetpack Compose for a modern and declarative UI.

Features
Display a series of images (artworks) inside a card component.
Show the title and author of each artwork below the image.
Buttons to navigate through the gallery of images.
Getting Started
Prerequisites
Android Studio Flamingo or higher.
Knowledge of Kotlin and Jetpack Compose.
The project includes some sample images and text resources in the res folder.
Installing
Clone the repository or download the project.
Open the project in Android Studio.
Sync Gradle if needed.
Run the project on an Android emulator or physical device.
Project Structure
The main components of this project include:

MainActivity.kt: This is the entry point of the app where the content is set. The ArtGallery composable is called here.
ArtGallery Composable: This is the main UI where the images, title, and author information are displayed, and navigation buttons allow the user to switch between different artworks.
Components
Images: Stored as drawable resources, the app displays different images based on the user's navigation.
Texts: Titles and authors are stored in strings.xml for localization purposes.

Output:

![Screenshot 2024-09-20 095402](https://github.com/user-attachments/assets/8a0c7950-eba0-42bb-971c-2771baa8d814)
![Screenshot 2024-09-20 095322](https://github.com/user-attachments/assets/8c3cf28e-2a05-4528-94c5-69bdbdbe5c24)
