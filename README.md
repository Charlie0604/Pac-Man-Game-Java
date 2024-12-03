# Pacman Game Project

## How to Run the Project

### Dependencies

- **Gradle 8.3**: The project uses Gradle for dependency management and building.
- **OpenJDK 17.0.12**: Ensure that you have this version installed.
- **JavaFX 17.0.12**: JavaFX is required for the graphical interface.

### Steps to Run

1. **Ensure you have the correct dependencies installed:**
   - OpenJDK version "17.0.12"
   - Gradle 8.3
   - JavaFX 17.0.12
2. **Clone the repository or download the project files.**
3. **In the root directory of the project, open a terminal and run the following command:**

   ```bash
   gradle clean build run
   ```
## Design Patterns Used

### 1. State Pattern

**Classes Involved:**

- `GhostState` (interface)
- `NormalState`, `FrightenedState` (concrete states)
- `GhostImpl` (context)

### 2. Decorator Pattern

**Classes Involved:**

- `GhostDecorator` (abstract decorator)
- `Blinky`, `Pinky`, `Inky`, `Clyde` (concrete decorators)
- `GhostImpl` (component)

## Notifications
- **`new-map2.txt`:** This file is used for testing purposes only. It should not be used for normal gameplay as it is a debug map designed for testing. For a proper game experience, use the regular game maps provided.
