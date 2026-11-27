# Contributing

## Branching model

- `main`: released code only. Every merge into `main` is tagged.
- `develop`: integration branch.
- `feature/<short-name>`: one branch per feature, created from `develop` and merged back through a pull request.

Pull requests are merged only when the CI pipeline is green.

## Commit messages

Commits follow [Conventional Commits](https://www.conventionalcommits.org/):

```
<type>(<optional scope>): <short summary>
```

| Type       | Usage                                           |
|------------|-------------------------------------------------|
| `feat`     | A new feature                                   |
| `fix`      | A bug fix                                       |
| `refactor` | A code change that neither fixes nor adds       |
| `test`     | Adding or updating tests                        |
| `docs`     | Documentation only                              |
| `style`    | Formatting only, no behavior change             |
| `build`    | Build system, dependencies, Docker              |
| `ci`       | CI configuration                                |
| `chore`    | Maintenance tasks                               |

Examples:

```
feat(client): add DBnomics REST client
test(processor): cover period normalization rules
```

## Releases

Each milestone is merged from `develop` into `main` and tagged with an annotated
[SemVer](https://semver.org/) tag (`v0.1.0`, `v0.2.0`, ...).
The `CHANGELOG.md` is updated in the same release.