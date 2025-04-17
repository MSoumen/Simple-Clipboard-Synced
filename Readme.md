All text that I need to access from both computer and mobile, Appered here
## 1. Clone the Repository (If you haven’t already)
Cloning a remote repository will copy all the files to your local machine:
`git clone https://github.com/MSoumen/Simple-Clipboard-Synced.git`

## 2. Navigate to the Repository
After cloning, go to the directory where the repository was cloned:
`cd repo-name`

## 3. Fetch Latest Changes
If the repository has already been cloned and you just want to fetch updates, use:
`git fetch origin`
This will download any new changes from the remote repository but won’t merge them into your local branch yet.

## 4. Merge Changes
To apply the fetched changes to your local branch, run:
`git merge origin/main`
Assuming you’re working on the main branch. Replace main with the relevant branch name if needed.

## 5. Work with Files
Now that the latest updates are fetched and merged, you can edit the files using any text editor or IDE of your choice. For example:
`nano Readme.md`

## 6. Stage, Commit, and Push Changes
Once you’ve made your edits and are ready to send updates back to the remote repository:

Stage Your Changes:
`git add .`
This stages all modified files.

Commit Your Changes:
`git commit -m "Describe your changes here"`

Push Your Changes:
`git push origin main`

7. Pull New Changes Later
As you continue to work, other collaborators might update the remote repository. To sync those changes with your local branch:
`git pull origin main`
