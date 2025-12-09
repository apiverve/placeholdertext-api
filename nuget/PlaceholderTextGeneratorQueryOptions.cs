using System;
using System.Collections.Generic;
using System.Text;
using Newtonsoft.Json;

namespace APIVerve.API.PlaceholderTextGenerator
{
    /// <summary>
    /// Query options for the Placeholder Text Generator API
    /// </summary>
    public class PlaceholderTextGeneratorQueryOptions
    {
        /// <summary>
        /// The style of placeholder text (lorem, tech, hipster, corporate, pirate, fantasy, scifi)
        /// Example: tech
        /// </summary>
        [JsonProperty("style")]
        public string Style { get; set; }

        /// <summary>
        /// Number of paragraphs to generate (1-20)
        /// Example: 3
        /// </summary>
        [JsonProperty("paragraphs")]
        public string Paragraphs { get; set; }

        /// <summary>
        /// Number of sentences per paragraph (1-15)
        /// Example: 5
        /// </summary>
        [JsonProperty("sentences")]
        public string Sentences { get; set; }
    }
}
