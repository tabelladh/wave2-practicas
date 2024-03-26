# Coding Guidelines
Contributions to this project are encouraged since we know that different developers will enrich our codebases :punch:.

However, absorbing all contributions as-is might lead to difficulties in the maintenance of the codebase that is left unchecked. Collaborative codebases often establish guidelines for contributors to ensure that code remains maintainable over time.

The purpose of this guide is to set a standard for contributions. These guidelines are not intended to limit the tools at your disposal nor to rewire the way you think, but rather to encourage better practices.

## Language Guidelines

We use **English** as the main language. Source code, comments, documentation, commit messages, review comments and any other kind of contribution must be written in English. We do this in order to be consistent throughout the project and to be considerate with devs that don't speak the same native language.

## Code Guidelines

MeLi has a lot of devs with different skills, technical background and native language. That is why it's imperative to sustain an engineering environment that is resilient to both scale and time. In this context, the goal of our rules is to manage the complexity of our development environment, keeping the codebase manageable while still allowing developers to work productively.

On a general basis, we use [code quality](https://furydocs.io/code-quality/latest/guide/#/languages/java) guides to keep the style of our projects aligned.

## Comment Guidelines :speech_balloon:

Code comments are hard to write, not because the words are difficult to produce but because it is hard to make relevant comments. Too much of it and people won't read them (not to mention that it obfuscates code reading). Too little of it leaves you with the single option of reading large portions of the codebase to get an insight as to what a feature or code block is doing. Both situations are undesirable and efforts should be made at all times to have a pleasant comment-reading experience.

As a general rule you would have to comment on decisions you made while coding that are not part of any specification.

In particular you should always comment any decision that:

* departs from common wisdom or convention (The why's are necessary).
* takes a significant amount of time to produce. A good rule of thumb here is that if you spent more than 1 hour thinking about how to produce a fragment of code that took 2 minutes to write, you should document your thinking to aid the reader and allow for validation.
* needs to preserve properties of the implementation. This is the case of performance-sensitive portions of the codebase, coroutines synchronization, implementations of security primitives, congestion control algorithms, etc.

As a general rule of what not to comment you should avoid:

* commenting on structure of programs that are already part of a convention, specified or otherwise.
* having pedantic explanations of behavior that can be found by immediate examination of the surrounding code artifacts.
* commenting on behaviors you can not attest to.

## Branching Guidelines :twisted_rightwards_arrows:

#### Follow this naming convention:
- For a patch that fixes unwanted behavior due to a bug, the branch name should start with `fix/`
- For a new feature or a change in an existent feature, the branch name should start with `feature/`
- After the category, the name should be at most three words long, all in lowercase and hyphen-separated.
- Example: `feature/debounce`, `fix/question-box-height`
> For more information, see [gitflow](https://furydocs.io/release-process/latest/guide/#/lang-es/workflows/02_gitflow)

## Git Guidelines :octocat:

In all commits please remember to **honour** the following [seven rules of a great Git commit message](https://chris.beams.io/posts/git-commit):

1. Separate subject from body with a blank line.
2. Limit the subject line to 50 characters. This will help you understand (and share with others) the core concept behind your work.
3. Capitalize the subject line.
4. Do not end the subject line with a period.
5. Use the imperative mood in the subject line.
	- ex: `Fix the xxxx table to correctly display xxxx infos`, instead of `Fixes ...`, `Fixing ...`, or `Fixed ...`
6. Wrap the body at 72 characters. (the body field is optional for all commits)
7. Use the body to explain the what and the why instead of how. Let your code explain how!

Commits such as "fix tests", "now it's working" and many other common messages we find usually in code **WON'T** be accepted.

These rules will be enforced on external contributions, though we may consider accepting contributions with small deviations from what's stated here.

Please avoid taking too much time to deliver code, and always [rebase](https://git-scm.com/docs/git-rebase) your code to avoid reverse merge commits.

## CHANGELOG Guidelines :page_facing_up:

In each version of a project please remember to **honour** the following [Keep a CHANGELOG](https://keepachangelog.com/en) guideline:

1. Changelogs are for humans :busts_in_silhouette:, not machines :robot:.
2. There should be an entry for every single version.
3. The same **types of changes** should be grouped.
4. Versions and sections should be linkable.
5. The latest version comes first.
6. The release date of each version is displayed in the format YYYY-MM-DD.

#### Types of change:
- `Added` for new features.
- `Changed` for changes in existing functionality.
- `Deprecated` for soon-to-be removed features.
- `Removed` for now removed features.
- `Fixed` for any bug fixes.
- `Security` in case of vulnerabilities.
