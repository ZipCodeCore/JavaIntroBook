BASE_NAME=JSPrepBook
WORKB_NAME=JSPrepWorkBook

all: $(BASE_NAME).pdf $(BASE_NAME).epub $(WORKB_NAME).pdf $(WORKB_NAME).epub 

$(BASE_NAME).pdf: prepare
	asciidoctor-pdf -D pdf index.adoc

$(BASE_NAME).epub: prepare
	/usr/local/bin/asciidoctor-epub3 -D epub index.adoc

$(WORKB_NAME).pdf: prepare
	asciidoctor-pdf -D pdf workbook.adoc

$(WORKB_NAME).epub: prepare
	/usr/local/bin/asciidoctor-epub3 -D epub workbook.adoc

index: prepare
	asciidoctor-pdf -D pdf index.adoc
	open pdf/index.pdf

prepress: prepare
	asciidoctor-pdf -D pdf printindex.adoc
	open pdf/printindex.pdf

workbook: prepare
	asciidoctor-pdf -D pdf workbook.adoc
	open pdf/workbook.pdf

prepare:
	mkdir -p pdf
	mkdir -p epub

clean:
	rm -rf pdf/ epub/
	rm -rf ZCW-JS-Prep.pdf ZCW-JS-Prep.epub
	rm -rf workbook.pdf index.pdf

pub:
	cp pdf/index.pdf ZCW-JS-Prep.pdf
	cp epub/index.epub ZCW-JS-Prep.epub