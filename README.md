# JavaIntroBook

This project has three books in it: _JavaIntroBook_, _JavaWorkbook_, and _JavaReader_.

## JavaIntroBook
source for ZCW Java Intro Book

this thing is NOT is Markdown, the source is in AsciiDoc.
Look at it, it's a better way of doing this for multi-file, multi-topic projects.

### install asciidoctor 

----
sudo gem install asciidoctor-pdf --pre

asciidoctor-pdf -v
----
*Asciidoctor PDF* is a native PDF converter for AsciiDoc.

### producing the digital versions

As of April 2021 use `make all` to make the products.
Use `make index` to preview the JavaPrepBook.
Use `make workbook` to preview the JavaPrepWorkbook.

Notes on S3 on Ruit Oceano Nox. (well, now in the app, but still)


### previously
to generate targets:
use `asciidoctor-pdf -D PDF index.adoc` to get index.pdf
use `/usr/local/bin/asciidoctor-epub3 -D EPUB index.adoc` to get EPUB/index.epub

to generate targets:
use `asciidoctor-pdf  -D PDF workbook.adoc` to get index.pdf
use `/usr/local/bin/asciidoctor-epub3 -D EPUB workbook.adoc` to get EPUB/index.epub

## JavaReader

This a book focused on getting students to read more, much more, Java source code.
It has a lot of exercises, and a lot of code to read.
In the age of GPT, we need to have more code for students to read and reason about.
Creating Code isn't the hard thing anymore. 
Now, it's the thinking. (Well, that's always been true hasn't it?)

### List of REPOs to reference:

- https://github.com/kristofer/FlappyBird
