package clean.code.design_patterns.requirements;

public class CharacterRenderer {
    private int xAxisUnit;
    private int yAxisUnit;

    public CharacterRenderer(int xAxisUnit, int yAxisUnit) {
        this.xAxisUnit = xAxisUnit;
        this.yAxisUnit = yAxisUnit;
    }

    private String[] renderComponent(int width, int height) {
        int componentWidth = width * xAxisUnit;
        int componentHeight = height * yAxisUnit;

        String line = stars(componentWidth);

        String[] component = new String[componentHeight];
        for (int i = 0; i < componentHeight; i++) {
            component[i] = line;
        }

        return component;
    }

    private String[] renderComponent(int width, int height, int xUnit, int yUnit) {
        int componentWidth = width * xUnit;
        int componentHeight = height * yUnit;

        String line = "";
        for (int i = 0; i < componentWidth; i++) {
            line = line + "*";
        }

        String[] component = new String[componentHeight];
        for (int i = 0; i < componentHeight; i++) {
            component[i] = line;
        }

        return component;
    }

    private String spaces(int length) {
        String spacesLine = "";

        for (int i = 0; i < length; i++) {
            spacesLine = spacesLine + " ";
        }

        return spacesLine;
    }

    private String stars(int length) {
        String starsLine = "";

        for (int i = 0; i < length; i++) {
            starsLine = starsLine + "*";
        }

        return starsLine;
    }

    private String hashtags(int length) {
        String hashtagsLine = "";

        for (int i = 0; i < length; i++) {
            hashtagsLine = hashtagsLine + "#";
        }

        return hashtagsLine;
    }

    private String pipes(int length) {
        String pipesLine = "";

        for (int i = 0; i < length; i++) {
            pipesLine = pipesLine + "|";
        }

        return pipesLine;
    }

    public void render(CharacterComponent head, CharacterComponent body, CharacterComponent arm, CharacterComponent leg) {
        String[] headIMG = renderComponent(head.getWidth(), head.getHeight());
        String[] bodyIMG = renderComponent(body.getWidth(), body.getHeight());
        String[] leftArmIMG = renderComponent(arm.getWidth(), arm.getHeight());
        String[] rightArmIMG = renderComponent(arm.getWidth(), arm.getHeight());

        int legWidth;
        if (leg.getWidth() > body.getWidth() / 2) {
            legWidth = body.getWidth() / 2;
        } else {
            legWidth = leg.getWidth();
        }

        String[] leftLegIMG = renderComponent(legWidth, leg.getHeight(), xAxisUnit , yAxisUnit);
        String[] rightLegIMG = renderComponent(legWidth, leg.getHeight(), xAxisUnit , yAxisUnit);

        // TO DO: Refactor hardcoding into skin implementation
        String headBottom = headIMG[yAxisUnit * head.getHeight() - 1];
        String headSkin = headBottom.substring(0, xAxisUnit * head.getWidth() / 3 - 1)
                + hashtags(xAxisUnit * head.getWidth() / 3)
                + headBottom.substring((xAxisUnit * head.getWidth() / 3) * 2 - 1);
        headIMG[yAxisUnit * head.getHeight() - 1] = headSkin;

        String armSkin1 = hashtags(xAxisUnit * arm.getWidth());
        String armSkin2 = pipes(xAxisUnit * arm.getWidth());
        leftArmIMG[yAxisUnit * arm.getWidth() - 1] = armSkin1;
        rightArmIMG[yAxisUnit * arm.getWidth() - 1] = armSkin1;
        for (int i = yAxisUnit * arm.getWidth(); i < yAxisUnit * arm.getHeight(); i++) {
            leftArmIMG[i] = armSkin2;
            rightArmIMG[i] = armSkin2;
        }

        String bodyTop = bodyIMG[0];
        String bodySkin = bodyTop.substring(0, xAxisUnit * body.getWidth() / 2 - 1) + "\\/"
                + bodyTop.substring(xAxisUnit * body.getWidth() / 2 + 1);
        bodyIMG[0] = bodySkin;

        String legSkinLeft;
        String legSkinRight;
        String bottomLegLeftSkin;
        String bottomLegRightSkin;

        // TO DO: Finish full implementation
        int baseWidth = 2 * arm.getWidth() + body.getWidth();

        if (head.getWidth() > baseWidth) {
            for (int i = 0; i < yAxisUnit * head.getHeight(); i++) {
                System.out.println(headIMG[i]);
            }

//            if (arm.getHeight() > body.getHeight()) {
//                for (int i = 0; i < yAxisUnit * body.getHeight(); i++) {
//                    System.out.println(spaces((xAxisUnit * (head.getWidth() - baseWidth)) / 2) + leftArmIMG[i]
//                            + bodyIMG[i] + rightArmIMG[i]);
//                }
//
//                for (int i = yAxisUnit * body.getHeight(); i < yAxisUnit * arm.getHeight(); i++) {
//                    System.out.println(spaces((xAxisUnit * (head.getWidth() - baseWidth)) / 2) + leftArmIMG[i]
//                            + leftLegIMG[i] + rightLegIMG[i] + rightArmIMG[i]);
//                }
//            }
        } else {
            for (int i = 0; i < yAxisUnit * head.getHeight(); i++) {
                System.out.println(spaces((xAxisUnit * (baseWidth - head.getWidth())) / 2) + headIMG[i]);
            }

            if (arm.getHeight() > body.getHeight()) {

            } else {
                for (int i = 0; i < yAxisUnit * arm.getHeight(); i++) {
                    System.out.println(leftArmIMG[i] + bodyIMG[i] + rightArmIMG[i]);
                }

                for (int i = yAxisUnit * arm.getHeight(); i < body.getHeight(); i++) {
                    System.out.println(spaces(xAxisUnit * arm.getWidth()) + bodyIMG[i]);
                }

                for (int i = 0; i < yAxisUnit * leg.getHeight(); i++) {
                    System.out.println(spaces(xAxisUnit * arm.getWidth()) + leftLegIMG[i] + rightLegIMG[i]);
                }
            }
        }
    }
}
