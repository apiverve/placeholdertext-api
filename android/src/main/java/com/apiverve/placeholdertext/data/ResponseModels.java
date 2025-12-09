// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.apiverve.data.Converter;
//
// Then you can deserialize a JSON string with
//
//     PlaceholderTextGeneratorData data = Converter.fromJsonString(jsonString);

package com.apiverve.placeholdertext.data;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static PlaceholderTextGeneratorData fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(PlaceholderTextGeneratorData obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(PlaceholderTextGeneratorData.class);
        writer = mapper.writerFor(PlaceholderTextGeneratorData.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// PlaceholderTextGeneratorData.java

package com.apiverve.placeholdertext.data;

import com.fasterxml.jackson.annotation.*;

public class PlaceholderTextGeneratorData {
    private String style;
    private String[] paragraphs;
    private long paragraphCount;
    private long sentencesPerParagraph;
    private long totalSentences;
    private long totalWords;
    private long totalCharacters;
    private String fullText;
    private String[] availableStyles;

    @JsonProperty("style")
    public String getStyle() { return style; }
    @JsonProperty("style")
    public void setStyle(String value) { this.style = value; }

    @JsonProperty("paragraphs")
    public String[] getParagraphs() { return paragraphs; }
    @JsonProperty("paragraphs")
    public void setParagraphs(String[] value) { this.paragraphs = value; }

    @JsonProperty("paragraph_count")
    public long getParagraphCount() { return paragraphCount; }
    @JsonProperty("paragraph_count")
    public void setParagraphCount(long value) { this.paragraphCount = value; }

    @JsonProperty("sentences_per_paragraph")
    public long getSentencesPerParagraph() { return sentencesPerParagraph; }
    @JsonProperty("sentences_per_paragraph")
    public void setSentencesPerParagraph(long value) { this.sentencesPerParagraph = value; }

    @JsonProperty("total_sentences")
    public long getTotalSentences() { return totalSentences; }
    @JsonProperty("total_sentences")
    public void setTotalSentences(long value) { this.totalSentences = value; }

    @JsonProperty("total_words")
    public long getTotalWords() { return totalWords; }
    @JsonProperty("total_words")
    public void setTotalWords(long value) { this.totalWords = value; }

    @JsonProperty("total_characters")
    public long getTotalCharacters() { return totalCharacters; }
    @JsonProperty("total_characters")
    public void setTotalCharacters(long value) { this.totalCharacters = value; }

    @JsonProperty("full_text")
    public String getFullText() { return fullText; }
    @JsonProperty("full_text")
    public void setFullText(String value) { this.fullText = value; }

    @JsonProperty("available_styles")
    public String[] getAvailableStyles() { return availableStyles; }
    @JsonProperty("available_styles")
    public void setAvailableStyles(String[] value) { this.availableStyles = value; }
}