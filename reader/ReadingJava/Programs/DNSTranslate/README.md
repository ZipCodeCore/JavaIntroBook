# dns record

What is DNS? Why does it matter?

THis is a python script which will help you to get the DNS records of a domain.

## What is DNS?

DNS stands for Domain Name System. It is a system that matches domain names to IP addresses. It is like a phone book for the internet. When you type a domain name into your browser, the DNS system looks up the IP address of the server that hosts the website.

## Why does it matter?

DNS is important because it is the backbone of the internet. Without DNS, you would have to remember the IP address of every website you want to visit. DNS makes it easy to remember domain names and access websites quickly.

## How to use this script?

This script uses the `socket` module in Python to get the DNS records of a domain. You can run this script from the command line and pass the domain name as an argument. For example:

```bash
python dns_record.py google.com
```

This will print the DNS records of the domain `google.com`.

## NOW, Translate this python script into a Java Class...

Make it general, so that it can be used from within another program.


### And some hints...

This script takes the website name as input and returns its dns records.

#### Requirements to run this file:

External library called dnspython has been used here and it can be installed easily by using the following command:

Contents of requirements.txt:

```
dnspython==2.0.0
```

pip install -r requirements.txt

#### How to use this script?

1.Install the requirements.

2. Type the following command

python dns_record.py

3.It will ask for a website:

You can give any website name for example: google.com
