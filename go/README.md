# Placeholder Text Generator API - Go Client

Placeholder Text Generator is a tool for generating placeholder text in various styles including lorem ipsum, tech jargon, hipster, corporate, pirate, fantasy, and sci-fi.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Go client for the [Placeholder Text Generator API](https://apiverve.com/marketplace/placeholdertext?utm_source=go&utm_medium=readme)

---

## Installation

```bash
go get github.com/apiverve/placeholdertext-api/go
```

---

## Configuration

Before using the Placeholder Text Generator API client, you need to obtain your API key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=go&utm_medium=readme)

---

## Quick Start

[Get started with the Quick Start Guide](https://docs.apiverve.com/quickstart?utm_source=go&utm_medium=readme)

The Placeholder Text Generator API documentation is found here: [https://docs.apiverve.com/ref/placeholdertext](https://docs.apiverve.com/ref/placeholdertext?utm_source=go&utm_medium=readme)

---

## Usage

```go
package main

import (
    "fmt"
    "log"

    "github.com/apiverve/placeholdertext-api/go"
)

func main() {
    // Create a new client
    client := placeholdertext.NewClient("YOUR_API_KEY")

    // Set up parameters
    params := map[string]interface{}{
        "style": "lorem",
        "paragraphs": 3,
        "sentences": 5
    }

    // Make the request
    response, err := client.Execute(params)
    if err != nil {
        log.Fatal(err)
    }

    fmt.Printf("Status: %s\n", response.Status)
    fmt.Printf("Data: %+v\n", response.Data)
}
```

---

## Example Response

```json
{
  "status": "ok",
  "error": null,
  "data": {
    "style": "tech",
    "paragraphs": [
      "Neural compiler iteration sprint cache kubernetes package database microservice encryption SDK JSON algorithm algorithm. Variable hardware load balancer protocol load balancer. Hardware middleware latency iteration neural package debugging query neural. DevOps backend compiler module container XML iteration stack encryption SDK. Middleware blockchain CI/CD debugging framework package virtualization bandwidth.",
      "SDK interface CI/CD git debugging interface REST middleware frontend typescript microservice query. Load balancer repository deployment microservice sprint sprint stack interface XML javascript hardware dependency. Dependency scalability deployment algorithm javascript runtime webhook interface server. Latency protocol refactor scalability refactor container deployment runtime throughput cache. Repository module runtime CI/CD hardware XML refactor cache backend middleware interface agile algorithm package algorithm.",
      "Framework debugging middleware compiler load balancer debugging bandwidth stack. Virtualization javascript protocol package debugging query agile scalability stack CI/CD. Deployment frontend webhook algorithm runtime runtime stack optimization. CI/CD iteration blockchain API load balancer stack variable throughput encryption algorithm middleware git javascript protocol. Encryption git module DevOps latency server."
    ],
    "paragraph_count": 3,
    "sentences_per_paragraph": 5,
    "total_sentences": 15,
    "total_words": 155,
    "total_characters": 1350,
    "full_text": "Neural compiler iteration sprint cache kubernetes package database microservice encryption SDK JSON algorithm algorithm. Variable hardware load balancer protocol load balancer. Hardware middleware latency iteration neural package debugging query neural. DevOps backend compiler module container XML iteration stack encryption SDK. Middleware blockchain CI/CD debugging framework package virtualization bandwidth.\n\nSDK interface CI/CD git debugging interface REST middleware frontend typescript microservice query. Load balancer repository deployment microservice sprint sprint stack interface XML javascript hardware dependency. Dependency scalability deployment algorithm javascript runtime webhook interface server. Latency protocol refactor scalability refactor container deployment runtime throughput cache. Repository module runtime CI/CD hardware XML refactor cache backend middleware interface agile algorithm package algorithm.\n\nFramework debugging middleware compiler load balancer debugging bandwidth stack. Virtualization javascript protocol package debugging query agile scalability stack CI/CD. Deployment frontend webhook algorithm runtime runtime stack optimization. CI/CD iteration blockchain API load balancer stack variable throughput encryption algorithm middleware git javascript protocol. Encryption git module DevOps latency server.",
    "available_styles": [
      "lorem",
      "tech",
      "hipster",
      "corporate",
      "pirate",
      "fantasy",
      "scifi"
    ]
  }
}
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=go&utm_medium=readme).

---

## Updates

Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=go&utm_medium=readme), [Privacy Policy](https://apiverve.com/privacy?utm_source=go&utm_medium=readme), and [Refund Policy](https://apiverve.com/refund?utm_source=go&utm_medium=readme).

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
