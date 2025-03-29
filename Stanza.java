class Stanza {
    String title;
    String poet;
    int lines;
    int words;
    String rhymeScheme;
    boolean isMetered;
    String theme;
    String language;
    int syllablesPerLine;
    boolean isPublished;

    public Stanza(String title) {
        this.title = title;
    }

    public Stanza(String title, String poet) {
        this(title);
        this.poet = poet;
    }

    public Stanza(String title, String poet, int lines) {
        this(title, poet);
        this.lines = lines;
    }

    public Stanza(String title, String poet, int lines, int words) {
        this(title, poet, lines);
        this.words = words;
    }

    public Stanza(String title, String poet, int lines, int words, String rhymeScheme) {
        this(title, poet, lines, words);
        this.rhymeScheme = rhymeScheme;
    }

    public Stanza(String title, String poet, int lines, int words, String rhymeScheme, boolean isMetered) {
        this(title, poet, lines, words, rhymeScheme);
        this.isMetered = isMetered;
    }

    public Stanza(String title, String poet, int lines, int words, String rhymeScheme, boolean isMetered, String theme) {
        this(title, poet, lines, words, rhymeScheme, isMetered);
        this.theme = theme;
    }

    public Stanza(String title, String poet, int lines, int words, String rhymeScheme, boolean isMetered, String theme, String language) {
        this(title, poet, lines, words, rhymeScheme, isMetered, theme);
        this.language = language;
    }

    public Stanza(String title, String poet, int lines, int words, String rhymeScheme, boolean isMetered, String theme, String language, int syllablesPerLine) {
        this(title, poet, lines, words, rhymeScheme, isMetered, theme, language);
        this.syllablesPerLine = syllablesPerLine;
    }

    public Stanza(String title, String poet, int lines, int words, String rhymeScheme, boolean isMetered, String theme, String language, int syllablesPerLine, boolean isPublished) {
        this(title, poet, lines, words, rhymeScheme, isMetered, theme, language, syllablesPerLine);
        this.isPublished = isPublished;
    }

    public void info() {
        System.out.println("Title: " + title);
        System.out.println("Poet: " + poet);
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Rhyme Scheme: " + rhymeScheme);
        System.out.println("Is Metered: " + isMetered);
        System.out.println("Theme: " + theme);
        System.out.println("Language: " + language);
        System.out.println("Syllables per Line: " + syllablesPerLine);
        System.out.println("Is Published: " + isPublished);
    }
}


