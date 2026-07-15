# Placeholder Text Generator API

Placeholder Text Generator is a tool for generating placeholder text in various styles including lorem ipsum, tech jargon, hipster, corporate, pirate, fantasy, and sci-fi.

![Build Status](https://img.shields.io/badge/build-passing-green)
![Code Climate](https://img.shields.io/badge/maintainability-B-purple)
![Prod Ready](https://img.shields.io/badge/production-ready-blue)
[![npm version](https://img.shields.io/npm/v/@apiverve/placeholdertext.svg)](https://www.npmjs.com/package/@apiverve/placeholdertext)

This is a Javascript Wrapper for the [Placeholder Text Generator API](https://apiverve.com/marketplace/placeholdertext?utm_source=npm&utm_medium=readme)

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
You can get it by signing up at [https://apiverve.com](https://apiverve.com?utm_source=npm&utm_medium=readme)

---

## Quick Start

[Get started with the Quick Start Guide](https://docs.apiverve.com/quickstart?utm_source=npm&utm_medium=readme)

The Placeholder Text Generator API documentation is found here: [https://docs.apiverve.com/ref/placeholdertext](https://docs.apiverve.com/ref/placeholdertext?utm_source=npm&utm_medium=readme).
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
  style: "lorem",
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
  style: "lorem",
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
  style: "lorem",
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
      "Docker latency interface debugging API git protocol module REST latency. DevOps API optimization javascript variable cache query blockchain. Scalability typescript API throughput typescript package refactor microservice blockchain docker compiler typescript. Algorithm query throughput scalability scalability microservice. DevOps algorithm XML throughput framework optimization API deployment docker deployment query sprint refactor stack.",
      "Neural deployment hardware bandwidth protocol stack variable algorithm iteration throughput algorithm kubernetes repository. Frontend server stack javascript CI/CD container module latency load balancer compiler cache DevOps. Server DevOps kubernetes bandwidth REST agile neural module repository. Database protocol stack bandwidth scalability optimization load balancer backend. Debugging DevOps webhook REST stack protocol hardware blockchain docker server agile microservice.",
      "Backend javascript throughput docker javascript stack debugging algorithm microservice cloud REST compiler DevOps runtime middleware. Deployment load balancer javascript query SDK bandwidth refactor typescript runtime throughput stack virtualization algorithm server. Backend cloud sprint latency repository microservice API hardware virtualization cache git. Middleware sprint module compiler query encryption debugging backend docker throughput microservice. Compiler variable latency iteration compiler frontend package agile microservice latency throughput API compiler XML DevOps."
    ],
    "paragraph_count": 3,
    "sentences_per_paragraph": 5,
    "total_sentences": 15,
    "total_words": 173,
    "total_characters": 1503,
    "full_text": "Docker latency interface debugging API git protocol module REST latency. DevOps API optimization javascript variable cache query blockchain. Scalability typescript API throughput typescript package refactor microservice blockchain docker compiler typescript. Algorithm query throughput scalability scalability microservice. DevOps algorithm XML throughput framework optimization API deployment docker deployment query sprint refactor stack.\n\nNeural deployment hardware bandwidth protocol stack variable algorithm iteration throughput algorithm kubernetes repository. Frontend server stack javascript CI/CD container module latency load balancer compiler cache DevOps. Server DevOps kubernetes bandwidth REST agile neural module repository. Database protocol stack bandwidth scalability optimization load balancer backend. Debugging DevOps webhook REST stack protocol hardware blockchain docker server agile microservice.\n\nBackend javascript throughput docker javascript stack debugging algorithm microservice cloud REST compiler DevOps runtime middleware. Deployment load balancer javascript query SDK bandwidth refactor typescript runtime throughput stack virtualization algorithm server. Backend cloud sprint latency repository microservice API hardware virtualization cache git. Middleware sprint module compiler query encryption debugging backend docker throughput microservice. Compiler variable latency iteration compiler frontend package agile microservice latency throughput API compiler XML DevOps."
  }
}
```

---

## Customer Support

Need any assistance? [Get in touch with Customer Support](https://apiverve.com/contact?utm_source=npm&utm_medium=readme).

---

## Updates

Stay up to date by following [@apiverveHQ](https://twitter.com/apiverveHQ) on Twitter.

---

## Legal

All usage of the APIVerve website, API, and services is subject to the [APIVerve Terms of Service](https://apiverve.com/terms?utm_source=npm&utm_medium=readme), [Privacy Policy](https://apiverve.com/privacy?utm_source=npm&utm_medium=readme), and [Refund Policy](https://apiverve.com/refund?utm_source=npm&utm_medium=readme).

---

## License
Licensed under the The MIT License (MIT)

Copyright (&copy;) 2026 APIVerve, and EvlarSoft LLC

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
