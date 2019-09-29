# CMPSC 100-03 Lab Session 5: HumanQuest, Part 2
* Assigned: 30 September 2019
* Due: 7 October 2019
* Point value: 45 pts

In this laboratory session, we explore topics including: 

* How classes model objects in Java
* Constructing classes, methods, and the relationships between them including:
    * Constructors
    * Mutators ("Setters")
    * Accessors ("Getters")
* Using objects constructed in classes stored in _external_ Java files

## General guidelines for laboratory sessions

* **Follow steps carefully.** Laboratory sessions often get a bit more complicated than their preceeding Practical sessions. Especially for early sessions which expose you to platforms with which you may not be familiar, take notes on `command`s you run and their corresponding effects/outputs. If you find yourself stuck on a step, let a TL or the professor know! Laboratory sessions do not mean that we won't help you in the same way we do during Practicals.
* **Regularly ask and answer questions.** Some of you may have more experience with the topics we're discussing than others. We can use this knowledge to our advantage. But, like in Practicals, let students try things for a while before offering help (**always _offer_ first**). To ask questions, use our [Slack](https://cmpsc100fall2019.slack.com)'s `#labs` channel.
* **Store and transfer files using GitHub.** Various forms of file storage are more or less volatile. *You* are responsible for backing up and storing files. If you're unsure of files which have been changed, you can always type `git status` in the terminal for your working folder to determine what you need to back up.
* **Keep all of your files.** See above, but also remember that you're responsible for the files you create.
* **Back up your files regularly.** See above (& above-above).
* **Review the [Honor Code](https://sites.allegheny.edu/about/honor-code/) reguarly when working.** If you're taking a solution from another student or the Internet at-large (_especially_ [Stack Overflow](https://stackoverflow.com)), bear in mind that using these solutions _can_ constitute a form of plagiarism that violates the Allegheny Honor Code. While it may seem easy and convenient to use these sources, it is equally easy and convenient to rely on them and create bad habits which include not attributing credit or relying exclusively on others to solve issues. Neither are productive uses of your intellect. Really.

## Further helpful reading for this assignment

If you have not already done so, I recommend reading the [GitHub Guides](https://guides.github.com) which GitHub makes available. In particular, the guides:
* [Mastering markdown](https://guides.github.com/features/mastering-markdown/)
* [Documenting your projects on GitHub](https://guides.github.com/features/wikis/)
* [GitHub Handbook](https://guides.github.com/introduction/git-handbook/)
* GitHub handouts distributed at the beginning of the lab session

As for a markdown cheatsheet, [this GitHub repository](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet) serves as a useful online, single-page guide.

## When we last left our intrepid hero...

![G. Wiz](https://cs.allegheny.edu/sites/dluman/cmpsc100/img/cmpsc-100-gator-wizard-crop.png)

G. Wiz and his crew had been playing HumanQuest along with nearly every other hip gator in the land. In fact, they've been playing so much of it that they've leveled up quite a bit. When facing challenges, they now roll **3** dice: a 10-sided one, a 12-sided one, and a 20-sided one instead of just one weird 13-sided die (which wasn't _really_ in the rules anyway; silly gator misread the player's handbook). 

However, they have yet to face one of the most fearsome creatures in the entirety of the human world in a "Boss battle."

![The Boss](https://cs.allegheny.edu/sites/dluman/cmpsc100/img/ulysses-4-teh-fanz.jpg)

Ulysses' main tactic is to _charm_ his opponents and, even though G. Wiz's character is pretty strong, legend has it that the strategy has becalmed even greater players. In fact, the other players in G. Wiz's game have all been charmed! It's up to him to win the day, if he can...

## Required deliverables

A successful submission for this lab includes two (2) Java files and one (1) `reflection.md` file.

- [ ] The repository should have at least 5 commits

### `Die.java`

- [ ] Contains no `TODO` placeholder markers
- [ ] Contains no `{YOUR NAME HERE}` placeholder markers
- [ ] Explicitly sets the value sent to the `constructor` equal to the variable in the class keeping track of the number of sides of a given dieObject
- [ ] Implements a correct method to return the value of a die roll using the `nextInt()` method of `Random`
- [ ] Implements a correct method to return the String form of a die roll's value

### `DisplayEncounters.java`

- [ ] Contains no `TODO` placeholder markers
- [ ] Contains no `{YOUR NAME HERE}` placeholder markers
- [ ] Contains a correct `import` statement to enable use of the `Die.java` code
- [ ] Initializes and uses the `Die` object to create dice
* You must create three (3) dice--one each of:
    * 10, 12, and 20 sides
- [ ] Uses the `roll` method of `Die.java` to roll a given die individually
- [ ] Uses the `getRoll` method of `Die.java` to get the value of a die rolls
- [ ] Tracks the incremental sum of various rolls in the `total` variable
- [ ] Passes the encounter `title`, `check` roll, and roll `total` to the `encounterReport` method
- [ ] Generates correct output which resembles the following:
```
To resist the charms of the The Boss:
Gator needed to roll    40
Gator's actual roll     20

The Gator Wizard was charmed!
```

### `reflection.md`

- [ ] Contains no `TODO` placeholder markers
- [ ] Contains at least 500 words
- [ ] Contains at least 5 headings
- [ ] Uses at least 1 list
- [ ] Uses at least one code block

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it.

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] In a terminal, ensure you're in the main folder of your practical repository and type `gradle build`
- [ ] After the `command` completes successfully, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`