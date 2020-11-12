package org.dhis2.data.forms.dataentry.fields.file;

import androidx.annotation.NonNull;

import org.dhis2.R;
import org.dhis2.data.forms.dataentry.DataEntryViewHolderTypes;
import org.dhis2.data.forms.dataentry.fields.FieldViewModel;
import org.dhis2.data.forms.dataentry.fields.common.FieldUiModel;
import org.hisp.dhis.android.core.common.ObjectStyle;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class FileViewModel extends FieldViewModel implements FieldUiModel {
    public static FieldViewModel create(String id, String label, Boolean mandatory, String value, String section, String description, ObjectStyle objectStyle) {
        return new AutoValue_FileViewModel(id, label, mandatory, value, section, null,
                true, null, null, null, description, objectStyle, null, DataEntryViewHolderTypes.BUTTON, R.layout.form_button);
    }

    @Override
    public FieldUiModel setMandatory() {
        return new AutoValue_FileViewModel(uid(), label(), true, value(), programStageSection(),
                allowFutureDate(), editable(), optionSet(), warning(), error(), description(), objectStyle(), null, DataEntryViewHolderTypes.BUTTON, R.layout.form_button);
    }

    @NonNull
    @Override
    public FieldUiModel withError(@NonNull String error) {
        return new AutoValue_FileViewModel(uid(), label(), mandatory(), value(), programStageSection(),
                allowFutureDate(), editable(), optionSet(), warning(), error, description(), objectStyle(), null, DataEntryViewHolderTypes.BUTTON, R.layout.form_button);
    }

    @NonNull
    @Override
    public FieldUiModel withWarning(@NonNull String warning) {
        return new AutoValue_FileViewModel(uid(), label(), mandatory(), value(), programStageSection(),
                allowFutureDate(), editable(), optionSet(), warning, error(), description(), objectStyle(), null, DataEntryViewHolderTypes.BUTTON, R.layout.form_button);
    }

    @NonNull
    @Override
    public FieldUiModel withValue(String data) {
        return new AutoValue_FileViewModel(uid(), label(), mandatory(), data, programStageSection(),
                allowFutureDate(), false, optionSet(), warning(), error(), description(), objectStyle(), null, DataEntryViewHolderTypes.BUTTON, R.layout.form_button);
    }

    @NonNull
    @Override
    public FieldUiModel withEditMode(boolean isEditable) {
        return new AutoValue_FileViewModel(uid(), label(), mandatory(), value(), programStageSection(),
                allowFutureDate(), isEditable, optionSet(), warning(), error(), description(), objectStyle(), null, DataEntryViewHolderTypes.BUTTON, R.layout.form_button);
    }
}
