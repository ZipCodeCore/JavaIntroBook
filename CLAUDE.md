# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository Overview

This is the JavaIntroBook project containing three educational Java books: JavaIntroBook, JavaWorkbook, and JavaReader. The content is authored in AsciiDoc format and published as PDF and EPUB formats for Zip Code Wilmington's Java curriculum.

## Project Structure

The repository has three main components:

- **IntroAndWorkBook/**: Main book content in AsciiDoc format with source files, exercises, and build system
- **reader/**: JavaReader book with reading exercises and example Java programs for student analysis
- **pdfmaker/**: PDF generation utilities with custom styling

## Common Development Tasks

### Building the Books
All build commands should be run from the `IntroAndWorkBook/` directory:

```bash
cd IntroAndWorkBook
make all          # Build all PDFs and EPUBs
make index        # Build and preview the main JavaIntroBook PDF
make workbook     # Build and preview the JavaWorkbook PDF
make prepress     # Build print-ready version
make clean        # Remove generated files
```

### Prerequisites
The build system requires:
- `asciidoctor-pdf` gem for PDF generation
- `asciidoctor-epub3` for EPUB generation

Install with: `sudo gem install asciidoctor-pdf --pre`

### Java Code Examples
The book includes a Maven project at `IntroAndWorkBook/src/zipcode/` with:
- Java 11 target
- JUnit 4.11 for testing
- Special `ZipCode` template class used throughout the book examples

Maven commands for the Java project:
```bash
cd IntroAndWorkBook/src/zipcode
mvn compile       # Compile Java sources
mvn test          # Run tests
mvn clean         # Clean build artifacts
```

## Content Architecture

### Book Content Files
- `index.adoc`: Main JavaIntroBook entry point
- `workbook.adoc`: JavaWorkbook entry point  
- `printindex.adoc`: Print-ready version
- Individual topic files: `variables.adoc`, `classes.adoc`, `methods.adoc`, etc.
- `wk/exercises1.adoc`, `wk/exercises2.adoc`: Exercise collections
- `appendixa.adoc`, `appendixb.adoc`, `appendixc.adoc`: Appendices

### Special ZipCode Template
The books use a special Java class template for examples:
```java
public class ZipCode {
  void compute() {
    // Your code goes in here...
  }
  
  public static void main(String args[]) { new ZipCode().compute(); }
}
```

This template is referenced throughout the book content and should be maintained when editing examples.

### Reader Component
The `reader/` directory contains:
- Reading exercises organized by difficulty level (`Level1/`, `Level3/`)
- Complete Java programs for analysis (`Programs/`)
- Pedagogical notes on code reading and comprehension

## File Formats and Conventions

- Content uses AsciiDoc markup (`.adoc` files)
- Java code examples should work with jshell when possible
- Images stored in `IntroAndWorkBook/images/`
- Generated outputs go to `pdf/` and `epub/` subdirectories
- Custom PDF themes: `indextheme.yml`, `jspreptheme.yml`

## Working with Content

When editing book content:
1. Edit the `.adoc` source files directly
2. Use `make index` or `make workbook` to preview changes
3. Maintain consistency with the ZipCode template pattern
4. Test Java examples for correctness
5. Ensure code examples are suitable for jshell execution when practical

The build system automatically handles PDF and EPUB generation from the AsciiDoc sources.