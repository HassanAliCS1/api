package com.email.api.model;

public class HtmlEmail {

    public static final String HTML_EMAIL_CONTENTS_FOR_CUSTOMER = "<html lang=\"en\" xmlns:th=\"http://www.thymeLeaf.org\">" +
            "<head>\n" +
            "  <meta charset=\"UTF-8\">\n" +
            "  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
            "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
            "  <title>EMKEE ORDER</title>\n" +
            "  <style>\n" +
            "    body {\n" +
            "      background-color: #fff;\n" +
            "      font-family: -apple-system, BlinkMacSystemFont, \"Segoe UI\", Roboto, Oxygen-Sans, Ubuntu, Cantarell, \"Helvetica Neue\", sans-serif;\n" +
            "    }\n" +
            "\n" +
            "    hr {\n" +
            "      background-color: #fff;\n" +
            "      border: 1px solid rgb(0, 0, 0, 0.1);\n" +
            "    }\n" +
            "\n" +
            "    .logo {\n" +
            "      padding: 30px 20px;\n" +
            "      width: 100px;\n" +
            "      height: 100px;\n" +
            "    }\n" +
            "\n" +
            "    .container-gif {\n" +
            "      display: flex;\n" +
            "      justify-content: center;\n" +
            "      width: 100%;\n" +
            "    }\n" +
            "\n" +
            "    .content {\n" +
            "      border: 1px solid rgb(0, 0, 0, 0.1);\n" +
            "      border-radius: 3px;\n" +
            "      overflow: hidden;\n" +
            "    }\n" +
            "\n" +
            "    .box-infos {\n" +
            "      padding: 20px 40px;\n" +
            "    }\n" +
            "\n" +
            "    .container-image-footer {\n" +
            "      padding: 45px 0 0 0;\n" +
            "    }\n" +
            "\n" +
            "    .paragraph {\n" +
            "      font-size: 16px;\n" +
            "    }\n" +
            "\n" +
            "    .footer-text {\n" +
            "      text-align: center;\n" +
            "      font-size: 12px;\n" +
            "      color: rgba(0, 0, 0, 0.7);\n" +
            "    }\n" +
            "  </style>\n" +
            "</head>\n" +
            "<body>\n " +
            "<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" align=\"center\" width=\"600\">\n" +
            "    <tr>\n" +
            "        <td class=\"content\">\n" +
            "            <div class=\"box-infos\" style=\"padding-bottom: 0;\">\n" +
            "                    <h1 style=\"font-size: 32px; font-weight: bold; text-align: center;\">Thank You!,</h1>\n" +
            "                    <h2 style=\"font-size: 26px; font-weight: bold; text-align: center;\">We have received your order.</h2>\n" +
            "                    <hr class=\"text-white\">\n" +
            "                    <p class=\"paragraph\" style=\"font-size: 16px;\">We will contact you shortly!</p>\n" +
            "                     </div>\n" +
            "                     <div class=\"container-gif\">\n" +
            "                        <iframe src=\"https://giphy.com/embed/tLGdBxGiGBNkI\" width=\"480\" height=\"425\" frameBorder=\"0\" padding-left=\"20px\" class=\"giphy-embed\" allowFullScreen></iframe>\n" +
            "             </div>\n" +
            "         </td>\n" +
            "   </tr>\n" +
            "    <tr>\n" +
            "          <td>\n" +
            "                 <p class=\"footer-text\">&copy; 2023 | Emkee Inc., 11 Henley St, Birmingham, B11 1JD, U.K | </p>\n" +
            "          </td>\n" +
            "    </tr>\n" +
            "</table>" +

            "</body>" +
            "</html>";
}
