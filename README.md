# Personal Finance Tracker App

A two-screen Android application developed in Kotlin as part of the "Modern Mobile App Development with Kotlin" sprint. The app includes a welcome screen and a finance tracker screen, and demonstrates Android activity lifecycle logging, intent navigation, and clean resource organization using XML.

## Features

- Two activities:
  - **MainActivity**: Welcome screen with buttons to track a new expense and share a sample expense.
  - **FinanceActivity**: Form screen to input expense details.
- Activity lifecycle methods are logged using `Log.d()` for debugging and analysis.
- Explicit intent used to navigate from MainActivity to FinanceActivity.
- Implicit intent used to share a sample expense message from MainActivity.
- All UI elements designed using **XML layouts** with **ConstraintLayout** as the root.
- Uses **MaterialTheme-compatible** colors, dimensions, and organized resources.

## Screens Overview

### MainActivity
- Welcome message (`TextView`)
- Track Expense button: launches FinanceActivity
- Share button: sends text via implicit intent, e.g., "I just added a new expense: Lunch – $10"

### FinanceActivity
- Expense Name (`EditText`)
- Amount (`EditText`)
- Category (`EditText` or `Spinner`)
- Save Expense button (UI only, not connected to data logic)

## Technical Details

- Minimum of 5 XML attributes applied per screen (e.g., `textSize`, `layout_margin`, `padding`, `gravity`, `textColor`)
- Resources are externalized:
  - `strings.xml` for text
  - `colors.xml` for color codes
  - `dimens.xml` for spacing, text sizes
  - `drawable/` for vector assets

## Deliverables

- Functional APK with:
  - Navigation between screens
  - Lifecycle logging in both activities
  - Working share intent
- XML layout files for both screens
- Populated resource files (strings, colors, dimens)
- Optional GitHub repository with clean structure, comments, and screenshots
- Optional demo video showing app usage (1–2 minutes)

## How to Run

1. Clone the repository (if on GitHub).
2. Open in Android Studio.
3. Build and run the project on an emulator or physical device (API 21+).
