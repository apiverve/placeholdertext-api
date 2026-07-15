declare module '@apiverve/placeholdertext' {
  export interface placeholdertextOptions {
    api_key: string;
    secure?: boolean;
  }

  /**
   * Describes fields the current plan does not unlock. Locked fields arrive as null
   * in `data`; `locked_fields` names them, using dot paths for nested fields.
   * Absent when the plan unlocks everything.
   */
  export interface PremiumInfo {
    message: string;
    upgrade_url: string;
    locked_fields: string[];
  }

  export interface placeholdertextResponse {
    status: string;
    error: string | null;
    data: PlaceholderTextGeneratorData;
    code?: number;
    premium?: PremiumInfo;
  }


  interface PlaceholderTextGeneratorData {
      style:                 null | string;
      paragraphs:            (null | string)[];
      paragraphCount:        number | null;
      sentencesPerParagraph: number | null;
      totalSentences:        number | null;
      totalWords:            number | null;
      totalCharacters:       number | null;
      fullText:              null | string;
  }

  export default class placeholdertextWrapper {
    constructor(options: placeholdertextOptions);

    execute(callback: (error: any, data: placeholdertextResponse | null) => void): Promise<placeholdertextResponse>;
    execute(query: Record<string, any>, callback: (error: any, data: placeholdertextResponse | null) => void): Promise<placeholdertextResponse>;
    execute(query?: Record<string, any>): Promise<placeholdertextResponse>;
  }
}
