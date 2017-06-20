package filter;

import java.util.Collection;

import com.vaadin.data.Property;
import com.vaadin.data.Validator;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Field;
import com.vaadin.ui.Label;

public class TTCustomLabeledField extends CustomComponent implements Field<String> {
    private Label label;

    public TTCustomLabeledField() {
        this.label = new Label();
        setCompositionRoot(label);
    }

    public TTCustomLabeledField(final String caption) {
        this.label = new Label(caption);
        setCompositionRoot(label);
    }

    @Override
    public boolean isRequired() {
        return false;
    }

    @Override
    public void setRequired(final boolean b) {
    }

    @Override
    public String getRequiredError() {
        return null;
    }

    @Override
    public void setRequiredError(final String s) {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {
        label.setValue("");
    }

    @Override
    public boolean isInvalidCommitted() {
        return false;
    }

    @Override
    public void setInvalidCommitted(final boolean b) {
    }

    @Override
    public void commit() throws SourceException, Validator.InvalidValueException {
    }

    @Override
    public void discard() throws SourceException {
    }

    @Override
    public boolean isBuffered() {
        return false;
    }

    @Override
    public void setBuffered(final boolean b) {
    }

    @Override
    public boolean isModified() {
        return false;
    }

    @Override
    public int getTabIndex() {
        return 0;
    }

    @Override
    public void setTabIndex(final int i) {
    }

    @Override
    public String getValue() {
        return label.getValue();
    }

    @Override
    public void setValue(final String value) throws ReadOnlyException {
        label.setValue(value);
    }

    @Override
    public Class<? extends String> getType() {
        return label.getType();
    }

    @Override
    public void addValidator(final Validator validator) {
    }

    @Override
    public void removeValidator(final Validator validator) {
    }

    @Override
    public void removeAllValidators() {
    }

    @Override
    public Collection<Validator> getValidators() {
        return null;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public void validate() throws Validator.InvalidValueException {
    }

    @Override
    public boolean isInvalidAllowed() {
        return false;
    }

    @Override
    public void setInvalidAllowed(final boolean b) throws UnsupportedOperationException {
    }

    @Override
    public void valueChange(final Property.ValueChangeEvent valueChangeEvent) {
    }

    @Override
    public void addValueChangeListener(final ValueChangeListener valueChangeListener) {
        label.addValueChangeListener(valueChangeListener);
    }

    @Override
    public void addListener(final ValueChangeListener valueChangeListener) {
        label.addValueChangeListener(valueChangeListener);
    }

    @Override
    public void removeValueChangeListener(final ValueChangeListener valueChangeListener) {
        label.removeValueChangeListener(valueChangeListener);
    }

    @Override
    public void removeListener(final ValueChangeListener valueChangeListener) {
        label.removeValueChangeListener(valueChangeListener);
    }

    @Override
    public Property getPropertyDataSource() {
        return null;
    }

    @Override
    public void setPropertyDataSource(final Property property) {
    }

    @Override
    public void focus() {
    }
}