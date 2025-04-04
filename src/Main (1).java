public class XMLManagerGUI {
    private JFrame frame;
    private JTextField tagField, contentField;
    private JList<String> xmlList;
    private XMLManager manager;

    public XMLManagerGUI() {
        manager = new XMLManager();
        frame = new JFrame("XML Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        tagField = new JTextField(20);
        contentField = new JTextField(20);
        JButton addButton = new JButton("Add Element");
        JButton saveButton = new JButton("Save XML");
        JButton readButton = new JButton("Read XML");

        xmlList = new JList<>(manager.getListModel());
        JScrollPane scrollPane = new JScrollPane(xmlList);

        addButton.addActionListener(e -> {
            String tag = tagField.getText();
            String content = contentField.getText();
            manager.addElement(tag, content);
        });

        saveButton.addActionListener(e -> {
            String fileName = "output.xml";
            manager.saveToFile(fileName);
        });

        readButton.addActionListener(e -> {
            String fileName = "output.xml";
            manager.readFromFile(fileName);
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("Tag:"));
        panel.add(tagField);
        panel.add(new JLabel("Content:"));
        panel.add(contentField);
        panel.add(addButton);
        panel.add(saveButton);
        panel.add(readButton);
        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, scrollPane);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new XMLManagerGUI();
    }
}
