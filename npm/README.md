# Placeholder Text Generator API

Placeholder Text Generator is a tool for generating placeholder text in various styles including lorem ipsum, tech jargon, hipster, corporate, pirate, fantasy, and sci-fi.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)

This is a Javascript Wrapper for the [Placeholder Text Generator API](https://apiverve.com/marketplace/placeholdertext)

---

## Installation

Using npm:
```shell
npm install @apiverve/placeholdertext
```

Using yarn:
```shell
yarn add @apiverve/placeholdertext
```

---

## Configuration

Before using the Placeholder Text Generator API client, you have to setup your account and obtain your API Key.
You can get it by signing up at [https://apiverve.com](https://apiverve.com)

---

## Quick Start

[Get started with the Quick Start Guide](https://docs.apiverve.com/quickstart)

The Placeholder Text Generator API documentation is found here: [https://docs.apiverve.com/ref/placeholdertext](https://docs.apiverve.com/ref/placeholdertext).
You can find parameters, example responses, and status codes documented here.

### Setup

```javascript
const placeholdertextAPI = require('@apiverve/placeholdertext');
const api = new placeholdertextAPI({
    api_key: '[YOUR_API_KEY]'
});
```

---

## Usage

---

### Perform Request

Using the API is simple. All you have to do is make a request. The API will return a response with the data you requested.

```javascript
var query = {
  style: "tech",
  paragraphs: 3,
  sentences: 5
};

api.execute(query, function (error, data) {
    if (error) {
        return console.error(error);
    } else {
        console.log(data);
    }
});
```

---

### Using Promises

You can also use promises to make requests. The API returns a promise that you can use to handle the response.

```javascript
var query = {
  style: "tech",
  paragraphs: 3,
  sentences: 5
};

api.execute(query)
    .then(data => {
        console.log(data);
    })
    .catch(error => {
        console.error(error);
    });
```

---

### Using Async/Await

You can also use async/await to make requests. The API returns a promise that you can use to handle the response.

```javascript
async function makeRequest() {
    var query = {
  style: "tech",
  paragraphs: 3,
  sentences: 5
};

    try {
        const data = await api.execute(query);
        console.log(data);
    } catch (error) {
        console.error(error);
    }
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

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact).

---

## Updates

Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms) and all legal documents and agreements.

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2025 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
