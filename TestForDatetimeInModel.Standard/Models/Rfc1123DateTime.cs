// <copyright file="Rfc1123DateTime.cs" company="APIMatic">
// Copyright (c) APIMatic. All rights reserved.
// </copyright>
namespace TestForDatetimeInModel.Standard.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel;
    using System.IO;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;
    using Newtonsoft.Json;
    using Newtonsoft.Json.Converters;
    using TestForDatetimeInModel.Standard;
    using TestForDatetimeInModel.Standard.Utilities;

    /// <summary>
    /// Rfc1123DateTime.
    /// </summary>
    public class Rfc1123DateTime
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Rfc1123DateTime"/> class.
        /// </summary>
        public Rfc1123DateTime()
        {
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="Rfc1123DateTime"/> class.
        /// </summary>
        /// <param name="dateTime">dateTime.</param>
        public Rfc1123DateTime(
            DateTime dateTime)
        {
            this.DateTime = dateTime;
        }

        /// <summary>
        /// Gets or sets DateTime.
        /// </summary>
        [JsonConverter(typeof(CustomDateTimeConverter), "r")]
        [JsonProperty("dateTime")]
        public DateTime DateTime { get; set; }

        /// <inheritdoc/>
        public override string ToString()
        {
            var toStringOutput = new List<string>();

            this.ToString(toStringOutput);

            return $"Rfc1123DateTime : ({string.Join(", ", toStringOutput)})";
        }

        /// <inheritdoc/>
        public override bool Equals(object obj)
        {
            if (obj == null)
            {
                return false;
            }

            if (obj == this)
            {
                return true;
            }
            return obj is Rfc1123DateTime other &&                this.DateTime.Equals(other.DateTime);
        }
        
        /// <summary>
        /// ToString overload.
        /// </summary>
        /// <param name="toStringOutput">List of strings.</param>
        protected void ToString(List<string> toStringOutput)
        {
            toStringOutput.Add($"this.DateTime = {this.DateTime}");
        }
    }
}