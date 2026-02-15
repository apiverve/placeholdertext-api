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
        /// The style of placeholder text
        /// </summary>
        [JsonProperty("style")]
        public string Style { get; set; }

        /// <summary>
        /// Number of paragraphs to generate
        /// </summary>
        [JsonProperty("paragraphs")]
        public string Paragraphs { get; set; }

        /// <summary>
        /// Number of sentences per paragraph
        /// </summary>
        [JsonProperty("sentences")]
        public string Sentences { get; set; }
    }
}
